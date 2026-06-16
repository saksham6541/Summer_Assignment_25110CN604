import java.util.Scanner;

public class Q83 {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.println("Input a string");
        String str = sc.nextLine();

        // Variables to count vowels and consonants
        int vol = 0;
        int cons = 0;

        // Convert string to lowercase for easy comparison
        str = str.toLowerCase();

        // Traverse each character of the string
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if character is an alphabet
            if (Character.isLetter(ch)) {

                // Check if character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vol++;
                } else {
                    cons++;
                }
            }
        }

        // Display number of vowels and consonants
        System.out.println("Number of Vowels = " + vol);
        System.out.println("Number of Constants = " + cons);

        // Close scanner
        sc.close();
    }
}