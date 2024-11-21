/**
 * @author Sadiya Maheen Siddiqui
 * @version 1.0
 * Class: BE 2nd Year, CSE
 * Roll Number: 100523733050
 * Java Assignment
*/

/*
Input: Any String of Text with Non-Plain English Letters
*/

import java.util.Scanner;

public class TextCleaner {

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "I used to think philosophy meant sitting in a çcolleëge auditorium, reading boring old texts in languageß no one speaks anymore. When I was 23, however, I discovered Ryan Holiday and his work on stoiïcismé. I réead his book The Obstacle Is the Way, and I réealiseéd I couldn’t have been more wrong. Philosoöphŷy is not about analyzing the thoughts of people who died loňng ago. It’s aboùut  how to live a good life, right here... right ñnow — and that’s exactly what philosophy is.";
        // String text = sc.nextLine();
        String cleanText = text.replaceAll("[^a-zA-Z0-9\\s,.!?'()-]", "");
        System.out.println(cleanText);
        sc.close();
    }
}
