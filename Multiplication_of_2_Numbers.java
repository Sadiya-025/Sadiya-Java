import java.util.Scanner;

public class Multiplication_of_2_Numbers {
    public static void main(String[] args) {
        int A, B, product;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the 2 Numbers A and B:");
        A = myObj.nextInt();
        B = myObj.nextInt();
        product = A * B;
        System.out.println("The value of A*B is " + product);
        myObj.close();
    }
}
