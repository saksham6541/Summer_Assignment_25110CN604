import java.util.*;

public class Q75
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
    
    static void transpose(int n, int mat1[][])        //display transpose without modifying original
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)            
            {
                System.out.printf("%d\t",mat1[j][i]);
            }            
            System.out.printf("\n");
        }
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
        print(n,mat1);        //display original matrix

        //TRANSPOSE-->
        System.out.printf("\nTranspose Matrix:\n");
        transpose(n,mat1);        //display transpose

        sc.close();
    }
}