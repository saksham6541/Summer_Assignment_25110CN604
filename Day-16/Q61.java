import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Input array size
        System.out.println("Input the size of the array");
        int n = obj.nextInt();

        int a[] = new int[n];

        // Input array elements
        System.out.println("Input the elements of the array");
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextInt();
        }
        obj.close();

        // XOR all indices and array elements
        int xor = n;
        for (int i = 0; i < n; i++) {
            xor ^= i;
            xor ^= a[i];
        }

        // Display missing number
        System.out.println("The missing number in the array is " + xor);
    }
}