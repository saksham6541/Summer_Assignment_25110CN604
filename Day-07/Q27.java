import java.util.Scanner;
public class Q27 {
    static int sum=0;
    static void sum_digit(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            sum+=n%10;
            sum_digit(n/10);
        }
    }
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input the number ");
        int n = Sc.nextInt();
        Sc.close();
        sum_digit(n);
        System.out.println("Sum of digits = "+sum);
    }
}
