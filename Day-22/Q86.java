import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner obj = new Scanner(System.in);

        // Take a sentence as input from the user
        System.out.println("Input the string");
        String str = obj.nextLine();

        // Variable to count spaces
        int count = 0;

        // Traverse the string character by character
        for (int i = 0; i < str.length(); i++) {

            // Get the current character
            char ch = str.charAt(i);

            // If a space is found, increase the count
            if (ch == ' ') {
                count++;
            }
        }

        // Number of words = Number of spaces + 1
        System.out.println("Number of words in the given sentence = " + (count + 1));

        // Close Scanner
        obj.close();
    }
}