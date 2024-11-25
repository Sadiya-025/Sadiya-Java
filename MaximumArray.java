//Program to find the largest and second largest in an array.

import java.util.Scanner;

public class MaximumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements in the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of the Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0] > arr[1] ? arr[0] : arr[1];
        int secLargest = arr[0] > arr[1] ? arr[1] : arr[0];

        for (int i = 2; i < n; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else {
                if (arr[i] > secLargest) {
                    secLargest = arr[i];
                } else {
                    continue;
                }
            }
        }
        System.out.println("The Largest Element is: " + largest);
        System.out.println("The Second Largest Element is: " + secLargest);
        sc.close();
    }
}
