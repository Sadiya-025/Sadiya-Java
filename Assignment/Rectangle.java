//Name: Sadiya Maheen Siddiqui
//Class: BE 2nd Year, CSE
//Roll Number: 100523733050
//Assignment Question: 6
//Using a loop, Draw a Shape of Rectangle of Size l,w. Distance between each successive '*' can be assumed as a unit length.

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle:");
        int l = sc.nextInt();
        System.out.println("Enter the Width of the Rectangle:");
        int w = sc.nextInt();
        for (int i = 0; i <= l; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i < w; i++) {
            System.out.print("*");
            for (int j = 1; j < l; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i <= l; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
