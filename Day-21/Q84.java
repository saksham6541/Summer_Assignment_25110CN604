import java.util.Scanner;

public class Q84 {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.println("Input a string");
        String str = sc.nextLine();

        // Convert string to uppercase
        str = str.toUpperCase();

        // Display uppercase string
        System.out.println("Uppercase String = " + str);

        // Close scanner
        sc.close();
    }
}