//Name: Sadiya Maheen Siddiqui
//Class: BE 2nd Year, CSE
//Roll Number: 100523733050
//Assignment Question: 2
//Find the values of 1) Left Shift Operator  2) Right Shift Operator 3) Bitwise Complement Operator for the Last 4 Digits of your Roll Number in 16 bit representation.

public class ShiftOperator {
    public static void main(String[] args) {
        String rollNumber = "100523733050";
        String subString = rollNumber.substring(8, 12);
        int lastFour = Integer.valueOf(subString);
        System.out.println(lastFour << 1); // Left Shift Operator
        System.out.println(lastFour >> 1); // Right Shift Operator
        System.out.println(~lastFour); // Bitwise Complement Operator
    }
}
