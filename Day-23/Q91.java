import java.util.Scanner;
import java.util.Arrays;

public class Q91 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Input first string
        System.out.println("Input the first String");
        String s = obj.nextLine();

        // Input second string
        System.out.println("Input the Second string");
        String t = obj.nextLine();

        // Convert both strings to lowercase
        // to make comparison case-insensitive
        s = s.toLowerCase();
        t = t.toLowerCase();

        // Frequency arrays for characters a-z
        int freq_t[] = new int[26];
        int freq_s[] = new int[26];

        // Count frequency of characters in first string
        for (int i = 0; i < s.length(); i++) {
            freq_s[s.charAt(i) - 'a']++;
        }

        // Count frequency of characters in second string
        for (int i = 0; i < t.length(); i++) {
            freq_t[t.charAt(i) - 'a']++;
        }

        // Compare both frequency arrays
        if (Arrays.equals(freq_s, freq_t)) {
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Not a valid Anagram");
        }

        // Close Scanner
        obj.close();
    }
}