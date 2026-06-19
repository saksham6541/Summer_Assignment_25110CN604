import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Take input string from user
        System.out.println("Input the string");
        String s = obj.nextLine();

        // Array to store frequency of each lowercase letter (a-z)
        int freq[] = new int[26];

        // Count frequency of every character in the string
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Variable to store index of first repeating character
        int result = -1;

        // Traverse the string and find the first character
        // whose frequency is greater than 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] > 1) {
                result = i;
                break;
            }
        }

        // Print the first repeating character if found
        if (result != -1) {
            System.out.println(s.charAt(result));
        }
        // Otherwise print message
        else {
            System.out.println("No such Character present in the String");
        }

        // Close Scanner to prevent resource leak
        obj.close();
    }
}