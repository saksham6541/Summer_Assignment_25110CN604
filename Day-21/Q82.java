import java.util.Scanner;

public class Q82 {
    public static void main(String[] args) {
        
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.println("Input a string");
        String str = sc.nextLine();

        // Variable to store reversed string
        String rev = "";

        // Traverse string from end to beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        // Display reversed string
        System.out.println("Reversed String = " + rev);

        // Close scanner
        sc.close();
    }
}