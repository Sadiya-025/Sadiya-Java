import java.util.Scanner;

public class Addition_of_2_Numbers {
  public static void main(String[] args) {
    int A, B, sum;
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the 2 Numbers A and B:");
    A = myObj.nextInt();
    B = myObj.nextInt();
    sum = A + B;
    System.out.println("The value of A+B is " + sum);
    myObj.close();
  }
}