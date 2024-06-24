package MultidimentionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int [][] matrix = new int[n][n];
        //2. Проверяваме шаблона
        switch (pattern) {
            case "A" -> fillMatrixPatternA(matrix);
            case "B" -> fillMatrixPatternB(matrix);
        }
        //3. Отпечатване на матрицата
        printMatrix(matrix);
    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int counter = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (col%2 == 1){
                    matrix[col][row] = counter++;
                }
                else{
                    matrix[row][col] = counter ++;
                }
            }

        }

    }

    private static void fillMatrixPatternA(int[][] matrix) {
        int counter = 1;
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[col][row] = counter++;

            }

        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row =0; row < matrix.length; row ++){
            for (int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
