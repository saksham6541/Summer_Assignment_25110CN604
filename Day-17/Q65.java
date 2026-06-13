import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.println("Input the size of first array");
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input second array
        System.out.println("Input the size of second array");
        int m = sc.nextInt();

        int b[] = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        // Create merged array
        int result[] = new int[n + m];

        // Copy first array
        for (int i = 0; i < n; i++) {
            result[i] = a[i];
        }

        // Copy second array
        for (int j = 0; j < m; j++) {
            result[n + j] = b[j];
        }

        // Display merged array
        System.out.println("Merged array");

        for (int i = 0; i < n + m; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}