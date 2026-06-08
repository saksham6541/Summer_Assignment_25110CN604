import java.util.Scanner;
public class Q46 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int n = sc.nextInt();

        if(armstrong(n))
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a Palindrome number");
        }
        sc.close();
    }    

    static boolean armstrong(int n)
    {
        int temp =n;
        int c=0;
        while(temp!=0)
        {
            c++;
            temp/=10;
        }
        temp=n;
        int sum =0;
        while(temp!=0)
        {
            int r = temp%10;
            sum=sum+(int)Math.pow(r,c);
            temp/=10;
        }
        if(n== sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
