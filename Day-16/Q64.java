import java.util.Scanner;
import java.util.HashSet;

public class Q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Input the size of the array");
        int n = sc.nextInt();

        int a[] = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Store unique elements in HashSet
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Print unique elements
        for (Integer num : set) {
            System.out.println(num);
        }

        sc.close();
    }
}