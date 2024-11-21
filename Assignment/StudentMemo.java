/**
 * @author Sadiya Maheen Siddiqui
 * @version 1.0
 * Class: BE 2nd Year, CSE
 * Roll Number: 100523733050
 * Java Assignment
*/

/*
Sample Subject Inputs:
Mathematics    100
Physics    100
Chemistry    100
*/

import java.util.Scanner;

//Exception Class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Main Class
public class StudentMemo {

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("University College of Engineering Programme");
        System.out.println("Year 2023-2024");
        System.out.print("Enter the Name of the Student: ");
        String name = sc.nextLine();
        System.out.print("Enter the Roll Number of the Student: ");
        String roll = sc.nextLine();
        System.out.print("Enter the Number of the Subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        sc.nextLine();
        System.out.println("Enter the Memorandum of Marks: ");
        for (int i = 0; i < n; i++) {
            String[] subject = sc.nextLine().split("\t");
            try {
                int mark = Integer.parseInt(subject[1]);
                if (mark < 0) {
                    throw new InvalidMarksException(
                            "Remarks: Invalid Input for Marks - " + subject[1] + " Is Negative");
                } else if (mark > 100) {
                    throw new InvalidMarksException(
                            "Remarks: Invalid Input for Marks - " + subject[1] + " Is Greater Than 100");
                }
                marks[i] = mark;
            } catch (NumberFormatException e) {
                System.out.println("Remarks: Invalid Input for Marks - " + subject[1] + " Not An Integer");
                System.exit(1);
            } catch (InvalidMarksException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        float average = (float) sum / n;
        char result;
        String promotion = "Yes";
        if (average >= 90) {
            result = 'S';
        } else if (average < 90 && average >= 80) {
            result = 'A';
        } else if (average < 80 && average >= 70) {
            result = 'B';
        } else if (average < 70 && average >= 60) {
            result = 'C';
        } else if (average < 60 && average >= 50) {
            result = 'D';
        } else if (average < 50 && average >= 40) {
            result = 'E';
        } else {
            result = 'F';
            promotion = "No";
        }
        System.out.println("---Student Memorandum---");
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + roll);
        System.out.println("Result: " + result);
        System.out.printf("Average Score: %.2f Marks\n", average);
        System.out.println("Result Promoted (As Applicable): " + promotion);
        sc.close();
    }
}