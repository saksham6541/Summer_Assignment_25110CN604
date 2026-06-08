import java.util.Scanner;
public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = sc.nextInt();

        perfect(n);

        sc.close();
        
    }   
    
    static void perfect(int n)
    {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (n == sum) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }

    }
}
