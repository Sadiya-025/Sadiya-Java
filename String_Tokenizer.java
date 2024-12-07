import java.util.StringTokenizer;
import java.util.Scanner;

public class String_Tokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        System.out.println("The Number of Tokens Are: " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        sc.close();
    }
}
