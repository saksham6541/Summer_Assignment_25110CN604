import java.util.Scanner;

public class Q60 {
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

        int start = 0;

        // move non-zero elements to front
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[start];
                a[start] = temp;
                start++;
            }
        }

        // display array
        System.out.println("Array with all zeros at end");

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        obj.close();
    }
}