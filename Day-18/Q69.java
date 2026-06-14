import java.util.Scanner;

public class Q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the size of the array");
        int n = sc.nextInt();

        int a[] = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < n; i++) {

            // Compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if elements are in wrong order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array");

        // Display sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}