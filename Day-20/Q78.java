import java.util.Scanner;

public class Q78 {
    public static void main(String[] args) {

        // Input size of square matrix
        System.out.println("Input the size of matrix");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        // Create matrix
        int a[][] = new int[n][n];

        // Input matrix elements
        System.out.println("Input the elements of the matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = obj.nextInt();
            }
        }

        // Create transpose matrix
        int transpose[][] = new int[n][n];

        // Find transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpose[i][j] = a[j][i];
            }
        }

        // Assume matrix is symmetric
        boolean check = true;

        // Compare matrix with its transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (transpose[i][j] != a[i][j]) {
                    check = false;
                    break;
                }
            }
        }

        // Display result
        if (check) {
            System.out.println("Matrix is symmetric");
        } else {
            System.out.println("Matrix is not symmetric");
        }

        obj.close();
    }
}