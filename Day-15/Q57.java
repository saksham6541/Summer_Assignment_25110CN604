import java.util.*;

public class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the size of the array");
        int n = sc.nextInt(); // input size

        int a[] = new int[n];

        // input elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int start = 0, end = n - 1;

        // reverse array
        for (int i = 0; i < n / 2; i++) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

        sc.close();
    }
}