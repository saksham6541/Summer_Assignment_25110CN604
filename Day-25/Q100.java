import java.util.Scanner;

public class Q100 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.println("Input the size");
        int n = sc.nextInt();

        // Consume leftover newline
        sc.nextLine();

        // Array to store words
        String arr[] = new String[n];

        // Input words
        System.out.println("Input the words");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Bubble Sort based on string length
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare lengths of adjacent strings
                if (arr[j].length() > arr[j + 1].length()) {

                    // Swap strings
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted by length:");
        for (String s : arr) {
            System.out.println(s);
        }

        // Close Scanner
        sc.close();
    }
}