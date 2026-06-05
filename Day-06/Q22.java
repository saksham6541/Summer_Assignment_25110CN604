    import java.util.Scanner;
    class Q22
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in );
            System.out.println("Input the number");
            int n= sc.nextInt();

            double d = 0;

            int i=0;
            while(n!=0)
            {
                int r= n%10;
                d +=r*Math.pow(2, i);
                n/=10;
                i++; 
            }

            System.out.println("Decimal Equivalent = "+d);

            sc.close();
        }
    }