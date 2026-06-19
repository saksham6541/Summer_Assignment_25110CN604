import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Input the string
        System.out.println("Input the String");
        String str = obj.nextLine();

        // Variable to store current word
        String s = "";

        // Variable to store the longest word found so far
        String m = "";

        // Add an extra space to process the last word
        str = str + " ";

        // Traverse the string character by character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If a space is encountered, a word has ended
            if (ch == ' ') {

                // Update longest word if current word is longer
                if (s.length() > m.length()) {
                    m = s;
                }

                // Reset current word
                s = "";
            } else {

                // Build the current word
                s += ch;
            }
        }

        // Print the longest word
        System.out.println(m);

        // Close Scanner
        obj.close();
    }
}