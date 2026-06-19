import java.util.Scanner;

public class Q94 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Input the string
        System.out.println("Input the String");
        String s = obj.nextLine();

        // Handle empty string case
        if (s.length() == 0) {
            System.out.println(0);
            obj.close();
            return;
        }

        // Array to store compressed result
        char[] arr = new char[s.length() * 2];

        // Convert string into character array
        char[] input = s.toCharArray();

        // Initialize first character and its count
        int vote = 1;
        char candidate = input[0];
        int j = 0;

        // Traverse the string and count consecutive characters
        for (int i = 1; i < input.length; i++) {

            if (input[i] == candidate) {
                vote++;
            } else {

                // Store character
                arr[j++] = candidate;

                // Store its frequency
                String count = String.valueOf(vote);
                for (int k = 0; k < count.length(); k++) {
                    arr[j++] = count.charAt(k);
                }

                // Move to next character group
                candidate = input[i];
                vote = 1;
            }
        }

        // Store the last character group
        arr[j++] = candidate;

        String count = String.valueOf(vote);
        for (int k = 0; k < count.length(); k++) {
            arr[j++] = count.charAt(k);
        }

        // Print compressed length
        System.out.println(j);

        // Print compressed string
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i]);
        }

        // Close Scanner
        obj.close();
    }
}