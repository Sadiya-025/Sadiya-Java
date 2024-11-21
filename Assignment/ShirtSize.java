//Name: Sadiya Maheen Siddiqui
//Class: BE 2nd Year, CSE
//Roll Number: 100523733050
//Assignment Question: 5
//Prepare a Program to determine the "Length" of a given T-Shirt Size using Switch - Case

import java.util.Scanner;

public class ShirtSize {
    public static void main(String[] args) {
        String shirtSize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the T-Shirt Size:");
        shirtSize = sc.nextLine();
        switch (shirtSize) {
            case "S":
                System.out.println("Length: 19 Inches");
                break;
            case "M":
                System.out.println("Length: 20 Inches");
                break;
            case "L":
                System.out.println("Length: 21 Inches");
                break;
            case "XL":
                System.out.println("Length: 22 Inches");
                break;
            case "XXL":
                System.out.println("Length: 23 Inches");
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}