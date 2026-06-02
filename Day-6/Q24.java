import java.util.*;
public class Q24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number ");
        int n = sc.nextInt();

        System.out.println("Input the power ");
        int p = sc.nextInt();

        int result = 1;
        for(int i = 1;i<=p;i++)
        {
            result*=n;
        }

        System.out.print("Result = "+result);
        sc.close();
    }
}