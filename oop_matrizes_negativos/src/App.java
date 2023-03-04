package oop_matrizes_negativos.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int negativos = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] < 0) {
                    negativos++;
                }
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.printf("Negative numbers = %d%n", negativos);

        sc.close();
    }
}
