package net;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размеры матрицы:");

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = randomNumMatrix(new int[n][m]);
        print(matrix);

        System.out.println("\nТранспортирование матрицы:\n");

        int[][] transportationMatrix = transportation(matrix);
        print(transportationMatrix);
    }

    public static int[][] randomNumMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static int[][] transportation(int[][] matrix) {
        int[][] transportationMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transportationMatrix[i][j] = matrix[j][i];
            }
        }
        return transportationMatrix;
    }

    public static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "   ");
            }
            System.out.println();
        }
    }
}

