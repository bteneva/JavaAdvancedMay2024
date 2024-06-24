package MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsColumns = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = rowsColumns[0];
        int columns = rowsColumns[1];
        int[][] intMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) { // Loop through each row
            String[] rowElements = scanner.nextLine().split("\\s+");
            for (int j = 0; j < columns; j++) { // Loop through each column
                intMatrix[i][j] = Integer.parseInt(rowElements[j]);
            }
        }
        int n = Integer.parseInt(scanner.nextLine());
        boolean notfound = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (intMatrix[i][j] == n){
                    System.out.println(i +" "+j);
                    notfound = false;

                }
            }

        }
        if (notfound){
            System.out.println("not found");
        }

    }
}
