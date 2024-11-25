//Write your information like regno, name, cgpa and phno into a file and read from the file andprint in the console. Use Serialization and Deserialization in the program.

import java.io.*;
import java.util.Scanner;

class Student implements Serializable {
    // transient int regNumber;
    int regNumber;
    String name;
    int cgpa;
    String phNo;

    public Student(int regNumber, String name, int cgpa, String phNo) {
        this.regNumber = regNumber;
        this.name = name;
        this.cgpa = cgpa;
        this.phNo = phNo;
    }
}

public class Serialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Registration Number: ");
        int regNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Name of the Student: ");
        String name = sc.nextLine();
        System.out.print("Enter the CGPA of the Student: ");
        int cgpa = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Phone Number of the Student: ");
        String phNo = sc.nextLine();
        Student student = new Student(regNumber, name, cgpa, phNo);
        try {
            FileOutputStream fout = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(student);
            out.close();
            fout.close();
            System.out.println("Object Serialized Successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            Student newStudent = (Student) in.readObject();
            in.close();
            fin.close();
            System.out.println("Object Deserialized Successfully");
            System.out.println("Registration Number: " + newStudent.regNumber + ", Name: " + newStudent.name
                    + ", CGPA: " + newStudent.cgpa + ", Phone Number: " + newStudent.phNo);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}