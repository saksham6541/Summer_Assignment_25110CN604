import java.util.*;

public class Q58 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Input the size of the array");
        int n = obj.nextInt(); // input size

        int a[] = new int[n];

        System.out.println("Input the elements of the array");

        // input elements
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }

        int temp = a[0];

        // left rotate array
        for (int i = 0; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        a[n - 1] = temp;

        // display rotated array
        System.out.println("Left rotated array:-");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        obj.close();
    }
}