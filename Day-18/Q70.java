import java.util.Scanner;

public class Q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the size of the array");
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            // Index of smallest element
            int low = smallest(a, i);

            // Swap elements
            int temp = a[i];
            a[i] = a[low];
            a[low] = temp;
        }

        System.out.println("Sorted Array");

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }

    static int smallest(int nums[], int n) {
        int lowest = n;

        // Find smallest element
        for (int i = n; i < nums.length; i++) {
            if (nums[i] < nums[lowest]) {
                lowest = i;
            }
        }

        return lowest;
    }
}