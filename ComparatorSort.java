//Use comparator to sort accounts by last name

import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Account {
    String firstName;
    String lastName;
    int balance;

    public Account(String firstName, String lastName, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + balance;
    }
}

class SortByLastName implements Comparator<Account> {
    public int compare(Account a1, Account a2) {
        return a1.lastName.compareTo(a2.lastName);
    }
}

class SortByBalance implements Comparator<Account> {
    public int compare(Account a1, Account a2) {
        return a1.balance - a2.balance;
    }
}

public class ComparatorSort {
    public static void display(ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Account Objects: ");
        int n = sc.nextInt();
        ArrayList<Account> accounts = new ArrayList<>();
        String firstName, lastName;
        int balance;
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Enter the First Name: ");
            firstName = sc.nextLine();
            System.out.print("Enter the Last Name: ");
            lastName = sc.nextLine();
            System.out.print("Enter the Account Balance: ");
            balance = sc.nextInt();
            accounts.add(new Account(firstName, lastName, balance));
        }
        System.out.println("The Account Objects before Sorting: ");
        display(accounts);
        System.out.println("The Account Objects sorted by Last Name: ");
        Collections.sort(accounts, new SortByLastName());
        display(accounts);
        System.out.println("The Account Objects sorted by Balance: ");
        Collections.sort(accounts, new SortByBalance());
        display(accounts);
        sc.close();
    }
}
