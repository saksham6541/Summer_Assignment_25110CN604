import java.util.*;

public class Q73
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
            {
                System.out.printf("%d\t",mat[i][j]);
            }
            System.out.printf("\n");
        }
    }
    
    static void addition(int n, int mat1[][], int mat2[][])        //add two matrices
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%d\t",(mat1[i][j]+mat2[i][j]));
            }
            System.out.printf("\n");
        }
    }
    
    public static void main(String[] sm)
    {
        System.out.println("Enter the size of both the matrices: ");
        int n =sc.nextInt();       //input matrix size

        int mat1[][] = new int[n][n], mat2[][] = new int[n][n];

        //INPUT-->
        System.out.printf("\nEnter %d elements in matrix 1:\n",(n*n));
        read(n,mat1);        //input first matrix
        System.out.printf("\nEnter %d elements in matrix 2:\n",(n*n));
        read(n,mat2);        //input second matrix

        //PRINT-->
        System.out.printf("\nMATRIX 1:\n");
        print(n,mat1);        //display first matrix
        System.out.printf("\nMATRIX 2:\n");
        print(n,mat2);        //display second matrix

        //ADDITION-->
        System.out.printf("\nMatrix after addition:\n");
        addition(n,mat1,mat2);        //display addition result

        sc.close();
    }
}