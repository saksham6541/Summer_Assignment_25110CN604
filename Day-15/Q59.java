import java.util.Scanner;

public class Q59 {
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

        int temp = a[n - 1];

        // right rotate array
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;

        // display rotated array
        System.out.println("Right rotated array:-");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        obj.close();
    }
}