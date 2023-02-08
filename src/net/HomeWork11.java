package net;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размеры матрицы:");

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int[][] transportationMatrix = new int[n][m];

        randomNumMatrix(matrix);
        System.out.println("\nТранспортирование матрицы:\n");
        transportation(matrix, transportationMatrix);
    }

    public static void randomNumMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void transportation(int[][] matrix, int[][] transportationMatrix) {
        for (int i = 0; i < transportationMatrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transportationMatrix[i][j] = matrix[j][i];
                System.out.print(transportationMatrix[i][j] + "    ");
            }
            System.out.println();
        }
    }
}

