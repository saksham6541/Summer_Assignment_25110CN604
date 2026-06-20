import java.util.Scanner;

public class Q99 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Input number of names
        System.out.println("Input the number of names");
        int n = obj.nextInt();

        // Consume the leftover newline character
        obj.nextLine();

        // Array to store names
        String arr[] = new String[n];

        // Input names
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLine();
        }

        // Bubble Sort using compareTo()
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent strings lexicographically
                if (arr[j].compareTo(arr[j + 1]) > 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted names
        System.out.println("Sorted Array:");
        for (String s : arr) {
            System.out.println(s);
        }

        // Close Scanner
        obj.close();
    }
}