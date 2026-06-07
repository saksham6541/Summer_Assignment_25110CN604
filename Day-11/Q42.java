import java.util.Scanner;
public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the two numbers ");
        int a= sc.nextInt();
        int b= sc.nextInt();

        int m  = max(a,b);

        System.out.println("Maximum of two numbers = "+m);
        sc.close();
    }    

    static int max(int m, int n)
    {
        if (m>n)
        {
            return m;
        }
        else{
            return n;
        }
    }
    
}
