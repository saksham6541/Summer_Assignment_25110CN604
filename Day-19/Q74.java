import java.util.Scanner;

public class Q74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of rows ");
        int n = sc.nextInt();
        System.out.println("Input the number of coloumns ");
        int m = sc.nextInt();

        int a[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int b[][] = new int[n][m];
        System.out.println("Input the elements of second matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int sum[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subtraction of two matrix:- ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(sum[i][j]);
            }
        }
    }
}