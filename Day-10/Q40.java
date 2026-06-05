public class Q40 {
    public static void main(String[] args) {
        for(int  i =1;i<=5;i++)
        {
            for(int n=1;n<=5-i;n++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)('A'+j-1));
            }
            for(int k = i-1;k>=1;k--)
            {
                System.out.print((char)(k+'A'-1));
            }
            System.out.println();
        }
    }
}
