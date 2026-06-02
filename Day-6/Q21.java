import java.util.Scanner;
class Q21
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number ");
        n = sc.nextInt();

        int binary[] = new int[32];

        int i =0;

        while(n>0)
        {
            binary[i]=n%2;
            n/=2;
            i++;
        }

        System.out.println("Binary Equivalent");

        for(int j =i-1;j>=0;j--)
        {
            System.out.print(binary[j]);
        }

        sc.close();
    }
}