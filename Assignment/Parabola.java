//Name: Sadiya Maheen Siddiqui
//Class: BE 2nd Year, CSE
//Roll Number: 100523733050
//Assignment Question: 7
//Simulate an approximate Graphical Representation in Cartesian Plane, using Loops for the Shape of a Parabola, y= x^2

import java.util.Scanner;
import java.lang.Math;

public class Parabola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Power of x: (2<=x<=4)");
        int n = sc.nextInt();
        if (n > 4 || n < 2) {
            System.out.println("Invalid Input");
            System.exit(1);
        }
        generate(n);
        sc.close();
    }

    public static void generate(int n) {
        for (double x = -3; x <= 3; x = x + 0.5) {
            double y = Math.pow(x, n);
            int yInt = (int) y + 40;
            plot(yInt);
        }
    }

    public static void plot(int y) {
        for (int i = 0; i <= y; i++) {
            System.out.print(" ");
            if (i == y) {
                System.out.println("*");
            }
        }
    }
}
