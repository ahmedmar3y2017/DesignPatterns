package problems.interviews.common;

import java.util.Scanner;

public class MatrixOperations_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Number of rows: ");
        int row = sc.nextInt();
        System.out.println("Number of columns: ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Matrix Data");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        print(matrix);
        System.out.println("-------- Addition ------- ");
        int[][] addition = addition(matrix, matrix);
        print(addition);

        System.out.println("-------- Subtraction ------- ");
        int[][] subtraction = subtraction(matrix, matrix);
        print(subtraction);


    }

    private static int[][] subtraction(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr2[0].length;

        int[][] result = new int[row][col];
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        return result;
    }

    private static void print(int[][] matrix) {
        System.out.println("Print Date");
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static int[][] addition(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr2[0].length;

        int[][] result = new int[row][col];
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }

}
