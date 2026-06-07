import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the two numbers ");
        int a= sc.nextInt();
        int b= sc.nextInt();

        int s  = sum(a,b);

        System.out.println("Sum of two numbers = "+s);
        sc.close();
    }    

    static int sum(int m, int n)
    {
        return m+n;
    }
}
