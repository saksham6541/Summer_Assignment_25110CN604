import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner obj = new Scanner(System.in);

        // Take string input from the user
        System.out.println("Input the String");
        String str = obj.nextLine();

        // Variable to store the string without spaces
        String result = "";

        // Traverse each character of the string
        for (int i = 0; i < str.length(); i++) {

            // Get current character
            char ch = str.charAt(i);

            // Append character only if it is not a space
            if (ch != ' ') {
                result += ch;
            }
        }

        // Display the modified string
        System.out.println("The Desired String without spaces = " + result);

        // Close Scanner
        obj.close();
    }
}