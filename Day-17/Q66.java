import java.util.Scanner;
import java.util.HashSet;

public class Q66 {
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

        sc.close();

        // Store unique elements
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }

        // Display union
        System.out.println("Union of two arrays :-");

        for (Integer num : set) {
            System.out.println(num);
        }
    }
}