import java.util.HashSet;
import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Input the string
        System.out.println("input the string");
        String str = obj.nextLine();

        // HashSet to keep track of characters already seen
        HashSet<Character> set = new HashSet<>();

        // Traverse the string character by character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Print the character only if it appears
            // for the first time
            if (!set.contains(ch)) {
                System.out.print(ch);
                set.add(ch);
            }
        }

        // Close Scanner
        obj.close();
    }
}