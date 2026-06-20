import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Input size of first array
        System.out.println("Input the size of first array");
        int n = obj.nextInt();

        // Input elements of first sorted array
        int a[] = new int[n];
        System.out.println("Input the elements of first array");
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        // Input size of second array
        System.out.println("Input the size of second array");
        int m = obj.nextInt();

        // Input elements of second sorted array
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = obj.nextInt();
        }

        // Pointers for traversing both arrays
        int i = 0;
        int j = 0;

        // Result array to store merged elements
        int result[] = new int[m + n];
        int k = 0;

        // Merge both arrays while elements remain in both
        while (i != n && j != m) {

            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of first array
        while (i < n) {
            result[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of second array
        while (j < m) {
            result[k] = b[j];
            j++;
            k++;
        }

        // Print merged sorted array
        for (k = 0; k < m + n; k++) {
            System.out.println(result[k]);
        }

        // Close Scanner
        obj.close();
    }
}