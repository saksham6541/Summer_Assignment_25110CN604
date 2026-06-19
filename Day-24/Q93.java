import java.util.Scanner;

public class Q93 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Input the original string
        System.out.println("Input the first String ");
        String s = obj.nextLine();

        // Input the target (goal) string
        System.out.println("Input the Goal String");
        String goal = obj.nextLine();

        // Check if goal can be obtained by rotating s
        // Concatenate s with itself and search for goal
        if ((s + s).contains(goal)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // Close Scanner
        obj.close();
    }
}