import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int n = sc.nextInt();

        int f= fact(n);
        System.out.println("Factorial = "+f);
        sc.close();
    }    
    static int fact(int n)
    {
        int f = 1;
        for(int i = 1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
}