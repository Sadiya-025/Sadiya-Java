//Write a java program that reads a line of integers and then displays each integer and the sum of all integers (using String Tokenizer).

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a Line of Integers: ");
        String values = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(values, " ");
        System.out.println("The Integers Entered are: ");
        while (tokenizer.hasMoreTokens()) {
            int token = Integer.parseInt(tokenizer.nextToken());
            System.out.print(token + " ");
            sum += token;
        }
        System.out.println("\nThe Sum of the Integers is: " + sum);
        sc.close();
    }
}
