//Use ListIterator to modify the objects being iterated on ArrayList

import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void display(ArrayList<String> fruits) {
        ListIterator<String> iter = fruits.listIterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        System.out.print("Enter the Number of Fruits: ");
        int n = sc.nextInt();
        System.out.println("Enter the Names of the Fruits: ");
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String fruit = sc.nextLine();
            fruits.add(fruit);
        }
        ListIterator<String> iter = fruits.listIterator();
        System.out.println("The Current Fruits: ");
        display(fruits);
        System.out.print("\nEnter the Name of the Fruit to Replace: ");
        String oldFruit = sc.nextLine();
        System.out.print("Enter the New Name of the Fruit: ");
        String newFruit = sc.nextLine();
        while (iter.hasNext()) {
            String fruit = iter.next();
            if (fruit.equals(oldFruit)) {
                iter.set(newFruit);
            }
        }
        System.out.println("The Modified List of Fruits: ");
        display(fruits);
        System.out.print("\nEnter the Fruit to Remove: ");
        String remFruit = sc.nextLine();
        iter = fruits.listIterator();
        while (iter.hasNext()) {
            String fruit = iter.next();
            if (fruit.equals(remFruit)) {
                iter.remove();
            }
        }
        System.out.println("The Modified List of Fruits: ");
        display(fruits);
        sc.close();
    }
}
