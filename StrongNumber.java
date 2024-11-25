//Strong number is a number whose sum of all digits’ factorial is equal to the number ‘n’. example : 145 = 1! + 4! + 5!

import java.util.Scanner;

public class StrongNumber {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int d, temp = n, sum = 0;
        while (temp > 0) {
            d = temp % 10;
            temp = temp / 10;
            sum += factorial(d);
        }
        if (n == sum) {
            System.out.println(n + " is a Strong Number");
        } else {
            System.out.println(n + " is Not a Strong Number");
        }
        sc.close();
    }
}
