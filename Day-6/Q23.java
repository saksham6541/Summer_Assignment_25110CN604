import java.util.Scanner;
class Q23
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

        int c=0;

        for(int j=0;j<i;j++)
        {
            if (binary[j]==1)
            {
                c++;
            }
        }

        System.out.println("Set bits in a namber are "+c);

        sc.close();
    }
}