import java.util.Scanner;
public class Q45 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int n = sc.nextInt();

        if(palindrome(n))
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a Palindrome number");
        }
        sc.close();
    }    

    static boolean palindrome(int n)
    {
        int temp =n;
        int rev=0;
        while(temp!=0)
        {
            int r=temp%10;
            rev = rev*10+r;
            temp/=10;
        }
        if(n== rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
