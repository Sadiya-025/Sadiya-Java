//Write a java program to multiply two given matrices.

import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] matmul(int[][] mat1, int[][] mat2, int p, int q, int r) {
        int[][] result = new int[p][r];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < q; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    public static void print(int[][] arr, int p, int q) {
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows in the First Matrix: ");
        int p = sc.nextInt();
        System.out.print("Enter the Number of Cols in the First Matrix: ");
        int q = sc.nextInt();
        System.out.print("Enter the Number of Cols in the Second Matrix: ");
        int r = sc.nextInt();
        int[][] mat1 = new int[p][q];
        int[][] mat2 = new int[q][r];
        int i, j;
        System.out.println("Enter the First Matrix: ");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Second Matrix: ");
        for (i = 0; i < q; i++) {
            for (j = 0; j < r; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        int[][] result = matmul(mat1, mat2, p, q, r);
        System.out.println("This is the First Matrix");
        print(mat1, p, q);
        System.out.println("This is the Second Matrix");
        print(mat2, q, r);
        System.out.println("This is the Resultant Matrix");
        print(result, p, r);
        sc.close();
    }
}