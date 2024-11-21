//Name: Sadiya Maheen Siddiqui
//Class: BE 2nd Year, CSE
//Roll Number: 100523733050
//Assignment Question: 4
//Implementing Method Recursion for Printing Numbers from n to 1; Where, n>2 and is Provided by the User.

import java.util.Scanner;

public class PrintNumbers {
    // Method Recursion
    public static void print(int n) {
        if (n >= 1) {
            System.out.println(n);
            print(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: (n>2)");
        int n = sc.nextInt();
        if (n <= 2) {
            System.out.println("The value of n must be greater than 2");
            System.exit(1);
        } else {
            System.out.println("Printing numbers from " + n + " to 1");
            print(n);
        }
        sc.close();
    }
}