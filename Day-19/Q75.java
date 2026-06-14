import java.util.Scanner;

public class Q75 {
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

        int transpose[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = a[i][j];
            }
        }

        System.out.println("Transposed Matrix:-");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(transpose[i][j]);
            }
        }
        sc.close();
    }
}
