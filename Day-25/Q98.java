import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Q98 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Input the string
        System.out.println("Input the String");
        String str = obj.nextLine();

        // HashMap to store frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of every character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Print all characters whose frequency is greater than 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        // Close Scanner
        obj.close();
    }
}