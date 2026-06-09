import java.util.Scanner;

public class Q49 {
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
        System.out.println("Array : ");
        for(int i =0;i<n;i++)
        {
            System.out.print(a[i]);
        }
        sc.close();
    }    
}
