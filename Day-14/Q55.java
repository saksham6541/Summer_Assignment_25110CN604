import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the size of the array");
        int n = sc.nextInt(); // input size

        int a[] = new int[n];

        // input elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];

        // find largest element
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        int s_max = Integer.MIN_VALUE;

        // find second largest element
        for (int i = 0; i < n; i++) {
            if (a[i] > s_max && a[i] != max) {
                s_max = a[i];
            }
        }

        System.out.println("Second largest element of the array is " + s_max);

        sc.close();
    }
}