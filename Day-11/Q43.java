import java.util.Scanner;
public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number ");
        int n = sc.nextInt();
        
        if(is_prime(n))
        {
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
        sc.close();
    }    
static boolean is_prime(int n)
{
    int p=-1;

    if (n<=1)
    {
        p=1;
    }
    for(int i =2;i<=n/2;i++)
    {
        if (n%i == 0)
        {
            p=1;
            break;
        }
    }
    if(p==1)
    {
        return false;
    }
    else{
        return true;
    }
}
}