import java.util.Scanner;

public class Division_of_2_Numbers_Integral_Input {
    public static void main(String[] args) {
        int A, B;
        double quotient;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the 2 Numbers A and B:");
        A = myObj.nextInt();
        B = myObj.nextInt();
        quotient = (double) A / B;
        System.out.println("The value of A/B is " + quotient);
        myObj.close();
    }
}
