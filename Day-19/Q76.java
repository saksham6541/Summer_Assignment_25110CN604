import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of rows ");
        int n = sc.nextInt();
        System.out.println("Input the number of coloumns");
        int m = sc.nextInt();

        int a[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == (n - 1)) {
                    sum += a[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal elements = " + sum);
        sc.close();
    }
}
