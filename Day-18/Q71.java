import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the size of the array");
        int n = sc.nextInt();

        int a[] = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Input the number to be searched");
        int target = sc.nextInt();

        // Sort array using Bubble Sort
        for (int i = 0; i < n; i++) {

            // Compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {

                    // Swap elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        int start = 0, end = n - 1, p = -1;

        // Binary Search
        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == target) {
                p = mid;
                break;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Display result
        if (p != -1) {
            System.out.println("Element found at " + p + "th index");
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}