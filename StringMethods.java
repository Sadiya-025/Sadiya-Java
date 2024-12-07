//Program to obtain the characters within a String using String class (charAt, getChars, toCharArray)

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the String: ");
        str = sc.nextLine();

        System.out.print("Enter the Index of the Character to Retrieve: ");
        int index = sc.nextInt();
        System.out.println("The Character at Index " + index + " is: " + str.charAt(index));

        System.out.print("Enter the Start Index of the String: ");
        int start = sc.nextInt();
        System.out.print("Enter the End Index of the String: ");
        int end = sc.nextInt();
        char[] newArray = new char[end - start];
        str.getChars(start, end, newArray, 0);
        System.out.println("This is the Sub-Character Array: ");
        System.out.println(Arrays.toString(newArray));

        char[] charArray = str.toCharArray();
        System.out.println("This is the Complete Character Array: ");
        System.out.println(Arrays.toString(charArray));
        sc.close();
    }
}
