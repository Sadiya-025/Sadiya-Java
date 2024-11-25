//Create a program to take input from user as 1 /2 /3, ifuser enters 1, display info about Arithmetic Exception, 2and 3 for Null pointer exception and Array index out ofbound exception, respectively. Use, Try, Catch block foreach exception individually.

import java.util.Scanner;
import java.util.Arrays;

public class Exceptions {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Choice (1/2/3): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                try {
                    int result = 5 / 0;
                    System.out.println(result);
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    int[] arr = null;
                    System.out.println(arr.length);
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    int[] arr = new int[5];
                    Arrays.fill(arr, 0);
                    System.out.println(arr[5]);
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
        }
        sc.close();
    }
}
