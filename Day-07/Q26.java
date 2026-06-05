import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        int n;

        Scanner Sc = new Scanner (System.in);
        System.out.println("Input the number :");
        n= Sc.nextInt();

        Sc.close();

        System.out.println("Fibonacci seires");
        for(int i =0;i<n;i++)
        {
            System.out.print(fibo(i));
        }
    }

    static int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return (fibo(n-1)+fibo(n-2));
        }
    }
}
