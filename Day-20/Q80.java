import java.util.Scanner;

public class Q80 {
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

        int sum = 0;

        // Find sum of each column
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                sum += a[j][i];
            }

            // Display column sum
            System.out.println("Sum of column " + i + " = " + sum);

            // Reset sum for next column
            sum = 0;
        }

        obj.close();
    }
}