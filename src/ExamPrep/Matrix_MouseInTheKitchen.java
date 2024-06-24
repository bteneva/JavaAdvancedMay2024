package ExamPrep;

import java.util.Scanner;

public class Matrix_MouseInTheKitchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);
        char[][] matrix = new char[rows][columns];

        // Fill the matrix and count the cheese
        int cheeseCount = 0;
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = line.charAt(col);
                cheeseCount = getCheeseCount(matrix, row, col, cheeseCount);
            }
        }

        // Find initial mouse position
        int[] mousePosition = mousePosition(matrix);
        int mouseRow = mousePosition[0];
        int mouseCol = mousePosition[1];

        // Process commands
        String command = scanner.nextLine();
        while (!command.equals("danger")) {
            int newRow = mouseRow;
            int newCol = mouseCol;
            switch (command) {
                case "up":
                    // handle up command row = row-1, col = col
                    newRow--;
                    break;
                case "down":
                    // handle down command row = row + 1; col = col
                    newRow++;
                    break;
                case "left":
                    // handle left command row = row; col--;
                    newCol--;
                    break;
                case "right":
                    // handle right command row = row; col++;
                    newCol++;
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
            if (!rowIsValid(newRow, matrix) || !colIsValid(newCol,matrix)){
                System.out.println("No more cheese for tonight!");
                printMatrix(matrix);
            }
            char symbol = matrix[newRow][newCol];
            if (symbol != '@'){
                matrix[newRow][newCol] = 'M';
                matrix[mouseRow][mouseCol] = '*';

                mouseRow = newRow;
                mouseCol = newCol;
            }
            switch (symbol){
                case 'T':
                    System.out.println("Mouse is trapped!");
                    printMatrix(matrix);
                    return;
                case 'C':
                    cheeseCount--;
                    if (cheeseCount==0){
                        System.out.println("No more cheese for tonight!");
                        return;
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println("Mouse will come back later!");
        printMatrix(matrix);

        // Close the scanner
        scanner.close();
    }

    private static void printMatrix(char[][]matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean colIsValid(int colIndex, char[][] matrix) {
        return colIndex >=0 && colIndex <= matrix[0].length;
    }


    private static boolean rowIsValid(int rowIndex, char[][] matrix) {
        return rowIndex >= 0 && rowIndex <= matrix.length;
    }


    private static int[] mousePosition(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'M') {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1}; // Return an invalid position if the mouse is not found
    }

    private static int getCheeseCount(char[][] matrix, int row, int col, int cheeseCount) {
        if (matrix[row][col] == 'C') {
            cheeseCount++;
        }
        return cheeseCount;
    }
}
