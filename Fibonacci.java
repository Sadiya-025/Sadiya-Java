//Demonstrate Fibonacci series in Java

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of the Index: ");
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("Fibonacci Number at Index " + n + " is: " + result);
        sc.close();
    }
}
