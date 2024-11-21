import java.util.Scanner;

public class Division_of_2_Numbers_All {
    public static void main(String[] args) {
        double A, B, quotient;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the 2 Numbers A and B:");
        A = myObj.nextDouble();
        B = myObj.nextDouble();
        quotient = A / B;
        System.out.println("The value of A/B is " + quotient);
        myObj.close();
    }
}
