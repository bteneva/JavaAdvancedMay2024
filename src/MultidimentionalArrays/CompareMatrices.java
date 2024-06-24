package MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 2; // Number of matrices
        int[][][] matrices = new int[n][][]; // Array to hold the matrices

        // Input for each matrix
        for (int m = 0; m < n; m++) { // Loop through each matrix
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

            // Store the matrix in the array
            matrices[m] = intMatrix;
        }

        // Compare the two matrices
        boolean areEqual = true;
        int[][] matrix1 = matrices[0];
        int[][] matrix2 = matrices[1];
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            areEqual = false;
        } else {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    if (matrix1[i][j] != matrix2[i][j]) {
                        areEqual = false;
                        break;
                    }
                }
                if (!areEqual) {
                    break;
                }
            }
        }

        // Output the result of the comparison
        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
