import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Q92 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Input the string
        System.out.println("Input the String");
        String s = obj.nextLine();

        // HashMap to store frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of every character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Variables to store the most frequent character
        int max = -1;
        char result = '\0';

        // Traverse the HashMap to find the character
        // having maximum frequency
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                result = entry.getKey();
                max = entry.getValue();
            }
        }

        // Print the most frequent character
        System.out.println(result);

        // Close Scanner
        obj.close();
    }
}