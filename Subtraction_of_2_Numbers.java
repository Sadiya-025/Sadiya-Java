import java.util.Scanner;
public class Subtraction_of_2_Numbers
{
    public static void main(String[]args)
    {
        int A, B, difference;
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter the 2 Numbers A and B:");
        A=myObj.nextInt();
        B=myObj.nextInt();
        difference=A-B;
        System.out.println("The value of A-B is "+difference);
        myObj.close();
    }
}
