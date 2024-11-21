import java.util.Scanner;
import java.lang.Math;

public class FunctionPlot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Function to be Printed: (sin, cos):");
        String function = sc.nextLine().trim().toLowerCase();
        if (isFunctionInMath(function)) {
            System.out.println("Enter the Number of Cycles:");
            int cycles = sc.nextInt();
            generate(function, cycles);
        } else {
            System.out.println(function + " is Not a Valid Function");
            System.exit(1);
        }
        sc.close();
    }

    public static void generate(String function, int cycles) {
        double initVal;
        for (int i = 0; i < cycles; i++) {
            if (i == 0) {
                initVal = 0d;
            } else {
                initVal = 15d;
            }
            for (double x = initVal; x <= 360; x = x + 15) {
                double y = calculateFunction(function, x);
                y = y * 10;
                long yRound = Math.round(y);
                int yInt = (int) yRound;
                yInt = yInt + 10;
                plot(x, yInt);
            }
        }
    }

    public static void plot(double x, int y) {
        for (int i = 0; i <= y; i++) {
            System.out.print(" ");
            if (i == y) {
                System.out.println("*");
            }
        }
    }

    public static boolean isFunctionInMath(String function) {
        switch (function) {
            case "sin":
            case "cos":
                return true;
            default:
                return false;
        }
    }

    public static double calculateFunction(String function, double x) {
        switch (function) {
            case "sin":
                return Math.sin(Math.toRadians(x));
            case "cos":
                return Math.cos(Math.toRadians(x));
            default:
                return 0;
        }
    }
}
