package MultidimentionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        String[][] matrix = new String[rows][columns];
        //1. Метод, който пълни матрицата с палиндроми
        fillMatrix(matrix);
        //2. Метод, който отпечатва матрицата
        printMatrix(matrix);



    }

    private static void fillMatrix(String[][] matrix) {
        int intASCIIvalueA = 97;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length ; column++) {
                char firstLetter = (char) (intASCIIvalueA + row);
                char secondLetter = (char) (intASCIIvalueA + row + column);
                char thirdLetter = (char) (intASCIIvalueA + row);

                String palindrome = String.format("%c%c%c", firstLetter, secondLetter, thirdLetter);
                matrix[row][column] = palindrome;
            }

        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row =0; row < matrix.length; row ++){
            for (int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
