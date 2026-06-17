import java.util.Scanner;

public class Q85 {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner obj = new Scanner(System.in);

        // Take string input from user
        System.out.println("Input the String");
        String str = obj.nextLine();

        // Assume the string is a palindrome initially
        boolean a = true;

        // Initialize two pointers:
        // i starts from the beginning and j starts from the end
        int i = 0;
        int j = str.length() - 1;

        // Compare characters from both ends
        while (i != j) {

            // If characters do not match, string is not a palindrome
            if (str.charAt(i) != str.charAt(j)) {
                a = false;
                break;
            }

            // Move pointers towards the center
            i++;
            j--;
        }

        // Display result
        if (a) {
            System.out.println("The given String is palindromic");
        } else {
            System.out.println("The given String is not palindromic");
        }

        // Close Scanner
        obj.close();
    }
}