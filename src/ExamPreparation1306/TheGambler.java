package ExamPreparation1306;

import java.util.Scanner;

public class TheGambler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[][] gameBoard = new String[n][n];  // Initialize as a square board for simplicity
        int amount = 100;
        int gamerStartingRow = 0;
        int gamersStartingCol = 0;
        for (int row = 0; row < n; row++) {
            String[] input = scanner.nextLine().split("");
            for (int col = 0; col < n; col++) {
                gameBoard[row][col] = input[col];
                if (input[col].equals("G")) {
                    gamerStartingRow = row;
                    gamersStartingCol = col;
                }
            }
        }

        boolean jackpotWin = false;
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "up" -> {
                    if (isOutOfTheBoard(gameBoard, gamerStartingRow - 1, gamersStartingCol)) {
                        System.out.println("Game over! You lost everything!");
                        return;
                    } else if (isEmptyField(gameBoard, gamerStartingRow - 1, gamersStartingCol)) {
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamerStartingRow--;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                    } else if (isWField(gameBoard, gamerStartingRow - 1, gamersStartingCol)) {
                        amount += 100;
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamerStartingRow--;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                    } else if (isPenaltyField(gameBoard, gamerStartingRow - 1, gamersStartingCol)) {
                        amount -= 200;
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamerStartingRow--;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                        if (isAmountNegativeOrZero(amount)) {
                            System.out.printf("Game over! You lost everything!");
                            return;
                        }
                    } else if (isJackpotField(gameBoard, gamerStartingRow - 1, gamersStartingCol)) {
                        amount += 100000;
                        System.out.printf("You win the Jackpot!%nEnd of the game. Total amount: %d$", amount);
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamerStartingRow--;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                        jackpotWin = true;
                        printTheGameBoard(gameBoard);
                        return;
                    }
                }
                case "down" -> {
                    if (isOutOfTheBoard(gameBoard, gamerStartingRow + 1, gamersStartingCol)) {
                        System.out.println("Game over! You lost everything!");
                        return;
                    } else if (isEmptyField(gameBoard, gamerStartingRow + 1, gamersStartingCol)) {
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamerStartingRow++;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                    } else if (isWField(gameBoard, gamerStartingRow + 1, gamersStartingCol)) {
                        amount += 100;
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamerStartingRow++;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                    } else if (isPenaltyField(gameBoard, gamerStartingRow + 1, gamersStartingCol)) {
                        amount -= 200;
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamerStartingRow++;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                        if (isAmountNegativeOrZero(amount)) {
                            System.out.printf("Game over! You lost everything!");
                            return;
                        }
                    } else if (isJackpotField(gameBoard, gamerStartingRow + 1, gamersStartingCol)) {
                        amount += 100000;
                        System.out.printf("You win the Jackpot!%nEnd of the game. Total amount: %d$", amount);
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamerStartingRow++;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                        jackpotWin = true;
                        printTheGameBoard(gameBoard);
                        return;
                    }
                }
                case "left" -> {
                    if (isOutOfTheBoard(gameBoard, gamerStartingRow, gamersStartingCol - 1)) {
                        System.out.println("Game over! You lost everything!");
                        return;
                    } else if (isEmptyField(gameBoard, gamerStartingRow, gamersStartingCol - 1)) {
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamersStartingCol--;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                    } else if (isWField(gameBoard, gamerStartingRow, gamersStartingCol - 1)) {
                        amount += 100;
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamersStartingCol--;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                    } else if (isPenaltyField(gameBoard, gamerStartingRow, gamersStartingCol - 1)) {
                        amount -= 200;
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamersStartingCol--;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                        if (isAmountNegativeOrZero(amount)) {
                            System.out.printf("Game over! You lost everything!");
                            return;
                        }
                    } else if (isJackpotField(gameBoard, gamerStartingRow, gamersStartingCol - 1)) {
                        amount += 100000;
                        System.out.printf("You win the Jackpot!%nEnd of the game. Total amount: %d$", amount);
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamersStartingCol--;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                        jackpotWin = true;
                        printTheGameBoard(gameBoard);
                        return;

                    }
                }
                case "right" -> {
                    if (isOutOfTheBoard(gameBoard, gamerStartingRow, gamersStartingCol + 1)) {
                        System.out.println("Game over! You lost everything!");
                        return;
                    } else if (isEmptyField(gameBoard, gamerStartingRow, gamersStartingCol + 1)) {
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamersStartingCol++;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                    } else if (isWField(gameBoard, gamerStartingRow, gamersStartingCol + 1)) {
                        amount += 100;
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamersStartingCol++;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                    } else if (isPenaltyField(gameBoard, gamerStartingRow, gamersStartingCol + 1)) {
                        amount -= 200;
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamersStartingCol++;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                        if (isAmountNegativeOrZero(amount)) {
                            System.out.printf("Game over! You lost everything!");
                            return;
                        }
                    } else if (isJackpotField(gameBoard, gamerStartingRow, gamersStartingCol + 1)) {
                        amount += 100000;
                        System.out.printf("You win the Jackpot!%nEnd of the game. Total amount: %d$", amount);
                        gameBoard[gamerStartingRow][gamersStartingCol] = "-";
                        gamersStartingCol++;
                        gamerMove(gameBoard, gamerStartingRow, gamersStartingCol);
                        jackpotWin = true;
                        printTheGameBoard(gameBoard);
                        return;
                    }
                }
            }
            command = scanner.nextLine();
        }
        if (!jackpotWin && amount > 0){
            System.out.printf("End of the game. Total amount: %d$", amount);
            printTheGameBoard(gameBoard);
        }
    }

    public static boolean isEmptyField(String[][] gameBoard, int row, int col) {
        return gameBoard[row][col].equals("-");
    }

    public static boolean isWField(String[][] gameBoard, int row, int col) {
        return gameBoard[row][col].equals("W");
    }

    public static boolean isPenaltyField(String[][] gameBoard, int row, int col) {
        return gameBoard[row][col].equals("P");
    }

    public static boolean isJackpotField(String[][] gameBoard, int row, int col) {
        return gameBoard[row][col].equals("J");
    }

    public static boolean isOutOfTheBoard(String[][] gameBoard, int row, int col) {
        return row < 0 || row >= gameBoard.length || col < 0 || col >= gameBoard[0].length;
    }

    public static boolean isAmountNegativeOrZero(int amount) {
        return amount <= 0;
    }

    public static void gamerMove(String[][] gameBoard, int row, int col) {
        gameBoard[row][col] = "G";
    }
    public static void printTheGameBoard (String[][]gameBoard){
        int rows = gameBoard.length;
        int cols = gameBoard[0].length;
        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }
}

