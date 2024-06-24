package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];
        String[][] playground = new String[n][m];
        int myPositionRow = 0;
        int myPositionCol = 0;

        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                char currentChar = row.charAt(j);
                playground[i][j] = String.valueOf(currentChar);
                if (playground[i][j].equals("B")) {
                    myPositionRow = i;
                    myPositionCol = j;
                }
            }
        }

        String command = scanner.nextLine();
        int touchesCount = 0;
        int movesCount = 0;

        while (!command.equals("Finish")) {
            switch (command) {
                case "up":
                    if (!outOfTheField(myPositionRow - 1, myPositionCol, n, m) && !ifObstacle(myPositionRow - 1, myPositionCol, playground)) {
                        myPositionRow--;
                        movesCount++;
                        playground[myPositionRow + 1][myPositionCol] = "-";
                        touchesCount = getTouchesCount(myPositionRow, myPositionCol, playground, touchesCount);
                    }
                    break;
                case "down":
                    if (!outOfTheField(myPositionRow + 1, myPositionCol, n, m) && !ifObstacle(myPositionRow + 1, myPositionCol, playground)) {
                        myPositionRow++;
                        movesCount++;
                        playground[myPositionRow - 1][myPositionCol] = "-";
                        touchesCount = getTouchesCount(myPositionRow, myPositionCol, playground, touchesCount);
                    }
                    break;
                case "right":
                    if (!outOfTheField(myPositionRow, myPositionCol + 1, n, m) && !ifObstacle(myPositionRow, myPositionCol + 1, playground)) {
                        myPositionCol++;
                        movesCount++;
                        playground[myPositionRow][myPositionCol - 1] = "-";
                        touchesCount = getTouchesCount(myPositionRow, myPositionCol, playground, touchesCount);
                    }
                    break;
                case "left":
                    if (!outOfTheField(myPositionRow, myPositionCol - 1, n, m) && !ifObstacle(myPositionRow, myPositionCol - 1, playground)) {
                        myPositionCol--;
                        movesCount++;
                        playground[myPositionRow][myPositionCol + 1] = "-";
                        touchesCount = getTouchesCount(myPositionRow, myPositionCol, playground, touchesCount);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println("Final Position: (" + myPositionRow + ", " + myPositionCol + ")");
        System.out.println("Touches Count: " + touchesCount);
        System.out.println("Moves Count: " + movesCount);
    }

    private static int getTouchesCount(int myPositionRow, int myPositionCol, String[][] playground, int touchesCount) {
        if (opponent(myPositionRow, myPositionCol, playground)) {
            touchesCount++;
            playground[myPositionRow][myPositionCol] = "B";
        }
        return touchesCount;
    }

    private static boolean opponent(int positionRow, int positionCol, String[][] playground) {
        return playground[positionRow][positionCol].equals("P");
    }

    private static boolean ifObstacle(int positionRow, int positionCol, String[][] playground) {
        return playground[positionRow][positionCol].equals("O");
    }

    private static boolean outOfTheField(int positionRow, int positionCol, int n, int m) {
        return positionRow >= n || positionCol >= m || positionRow < 0 || positionCol < 0;
    }
}
