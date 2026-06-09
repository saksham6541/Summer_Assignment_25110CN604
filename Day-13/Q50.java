import java.util.Scanner;
public class Q50 {
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
        

        int sum = 0;

        for(int i =0;i<n;i++)
        {
            sum+=a[i];
        }

        System.out.println("Sum of array = "+sum);
        double avg = sum/n;
        System.out.println("Average of array = "+avg);

        sc.close();
    }
}
