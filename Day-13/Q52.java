import java.util.Scanner;
public class Q52 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the array");
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int o_sum=0;
        int e_sum=0;

        for(int i =0;i<n;i++)
        {
            if(a[i]%2 == 0)
            {
                e_sum+=a[i];
            }
            else
            {
                o_sum+=a[i];
            }
        }
        sc.close();

        System.out.println("Sum of odd elements = "+o_sum);
        System.out.println("Sum of even elemets = "+e_sum);
        
    }
}
