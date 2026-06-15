import java.util.*;

public class Q76
{
    static Scanner sc = new Scanner(System.in);

    static void read(int n,int mat[][])        //read matrix elements
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
        }
    }
    
    static void print(int n,int mat[][])        //display matrix
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)            
                System.out.printf("%d\t",mat[i][j]);

            System.out.printf("\n");
        }
    }
    
    static void diags(int n, int mat[][])        //calculate diagonal sums
    {
        int ld=0,rd=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)            
            {
                if(i==j)        //left diagonal condition
                    ld+=mat[i][j];
                if((i+j)==(n-1))        //right diagonal condition
                    rd+=mat[i][j];
            }
        }
        int x = (n%2!=0)?((ld+rd)-mat[n/2][n/2]):((ld+rd));
        System.out.printf("\nSum of left diagonal elements = %d.\nSum of right diagonal elements = %d.\nSum of all diagonal elements = %d.",ld,rd,x);
    }
    
    public static void main(String[] sm)
    {
        System.out.println("Enter the size of the matrix: ");
        int n =sc.nextInt();       //input matrix size

        int mat1[][] = new int[n][n];

        //INPUT-->
        System.out.printf("\nEnter %d elements in the matrix:\n",(n*n));
        read(n,mat1);        //input matrix

        //PRINT-->
        System.out.printf("\nMATRIX:\n");
        print(n,mat1);        //display matrix

        //DIAGONAL SUM-->
        diags(n,mat1);        //calculate and display diagonal sums

        sc.close();
    }
}