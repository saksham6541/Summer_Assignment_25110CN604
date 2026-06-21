import java.util.Random;
import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Create Random object to generate random numbers
        Random random = new Random();

        // Generate a random number between 1 and 100
        int secret = random.nextInt(100) + 1;

        int guess;      // Stores user's guess
        int attempt = 0; // Counts number of attempts

        // Display instructions
        System.out.println("Guess a number between 1 to 100");

        // Repeat until the correct number is guessed
        do {
            guess = obj.nextInt();
            attempt++;

            // Check if guess is too high
            if (guess > secret) {
                System.out.println("Too High");
            }

            // Check if guess is too low
            else if (guess < secret) {
                System.out.println("Too Low");
            }

            // Correct guess
            else {
                System.out.println("Correct!!");
            }

        } while (guess != secret);

        // Display total attempts taken
        System.out.println("Guessed in " + attempt + " attempts");

        // Close Scanner
        obj.close();
    }
}