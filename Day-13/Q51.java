import java.util.Scanner;
public class Q51 {
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

        int max =a[0],min=a[0];
        for(int i =0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }

        sc.close();

        System.out.println("Maximum element of the array = "+max);
        System.out.println("Minimum element of the array = "+min);
    }    
}