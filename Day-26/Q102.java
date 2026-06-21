import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Input age from user
        System.out.println("Input your age");
        int n = obj.nextInt();

        // Check for invalid age
        if (n < 0) {
            System.out.println("Invalid Age");
        }

        // Check if age is less than 18
        else if (n < 18) {
            System.out.println("Not Eligible");
        }

        // Age is 18 or above
        else {
            System.out.println("Eligible!!");
        }

        // Close Scanner
        obj.close();
    }
}