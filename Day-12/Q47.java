import java.util.Scanner;

public class Q47 {
    
    static int fibo(int n) {
        if (n == 0) {
            return 0;
        } 
        else if (n == 1) {
            return 1;
        } 
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = fibo(i);
            System.out.print(a + " ");
        }

        sc.close();
    }
}