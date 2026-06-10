import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the size of the array");
        int n = sc.nextInt(); // input size

        int a[] = new int[n];

        // input elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Input the element ");
        int target = sc.nextInt();

        int c = 0; // count occurrences

        // count frequency
        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                c++;
            }
        }

        // display result
        if (c != 0) {
            System.out.println("Element Found " + c + " times");
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}