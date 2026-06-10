import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the size of the array");
        int n = sc.nextInt(); // input size

        int a[] = new int[n];

        // input elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Input the element to be Searched");
        int target = sc.nextInt();

        int pos = -1; // stores position

        // linear search
        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                pos = i;
            }
        }

        // display result
        if (pos != -1) {
            System.out.println("Element found at position " + pos);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}