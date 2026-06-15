import java.util.Scanner;

class Q77 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Input dimensions of first matrix
        System.out.println("Input the number of rows of first array");
        int n = obj.nextInt();

        System.out.println("Input the number of columns of first array");
        int m = obj.nextInt();

        // Input dimensions of second matrix
        System.out.println("Input the number of rows of second array");
        int r = obj.nextInt();

        System.out.println("Input the number of columns of second array");
        int c = obj.nextInt();

        // Create matrices
        int a[][] = new int[n][m];
        int b[][] = new int[r][c];

        // Input elements of first matrix
        System.out.println("Input the elements of first array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = obj.nextInt();
            }
        }

        // Input elements of second matrix
        System.out.println("Input the elements of second array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = obj.nextInt();
            }
        }

        // Product matrix will have n rows and c columns
        int product[][] = new int[n][c];

        // Matrix multiplication is possible only if
        // number of columns of first matrix = number of rows of second matrix
        if (m != r) {
            System.out.println("Array cannot be multiplied");
        } else {

            // Matrix multiplication
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < c; j++) {

                    // Calculate value of product[i][j]
                    for (int k = 0; k < m; k++) {
                        product[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            // Display multiplied matrix
            System.out.println("Multiplied matrix");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }

        obj.close();
    }
}