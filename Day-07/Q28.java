import java.util.Scanner;

public class Q28 {

    static int reverse =0;
    public static void main(String[] args) {
        int n;

        Scanner Sc = new Scanner (System.in);
        System.out.println("Input the number :");
        n= Sc.nextInt();

        Sc.close();

        Reverse_num(n);

        System.out.println("Reverse of the number = "+reverse);
    }

    static void Reverse_num(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            reverse = reverse*10+(n%10);
            Reverse_num(n/10);
        }
    }
}