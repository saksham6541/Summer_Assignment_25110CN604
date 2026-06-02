import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        int n;

        Scanner Sc = new Scanner (System.in);
        System.out.println("Input the number :");
        n= Sc.nextInt();

        int f=factorial(n);

        System.out.println("Factorial of "+n+" is "+f);
        Sc.close();
    }
    static int factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}