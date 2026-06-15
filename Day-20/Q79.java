import java.util.Scanner;

public class Q79 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Input the number of rows");
        int r = obj.nextInt();

        System.out.print("Input the number of columns");
        int c = obj.nextInt();

        // Create matrix
        int a[][] = new int[r][c];

        // Input matrix elements
        System.out.println("Input the elements of the matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = obj.nextInt();
            }
        }

        // Find sum of each row
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum += a[i][j];
            }

            // Display row sum
            System.out.println("Sum of row " + i + " = " + sum);

            // Reset sum for next row
            sum = 0;
        }

        obj.close();
    }
}