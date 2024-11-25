package Package2;

import java.util.Scanner;
import Package1.SubPackage1.Student;

public class PackageTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name of the Student: ");
        String name = sc.nextLine();
        System.out.print("Enter the Age of the Student: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Phone Number of the Student: ");
        String phNo = sc.nextLine();
        Student student = new Student(name, age, phNo);
        System.out.println(student.getValues());
        student.printValues();
        sc.close();
    }

}
