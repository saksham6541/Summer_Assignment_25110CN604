import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Q87 {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner obj = new Scanner(System.in);

        // Take string input from the user
        System.out.println("Input the String");
        String str = obj.nextLine();

        // HashMap to store character frequencies
        HashMap<Character, Integer> map = new HashMap<>();

        // Traverse the string and count occurrences of each character
        for (int i = 0; i < str.length(); i++) {

            // Get current character
            char ch = str.charAt(i);

            // If character already exists in the map,
            // increment its frequency
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                // Otherwise insert it with frequency 1
                map.put(ch, 1);
            }
        }

        // Display each character and its frequency
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Close Scanner
        obj.close();
    }
}