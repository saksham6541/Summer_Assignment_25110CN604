import java.util.Scanner;
import java.util.Random;

public class Q104 {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Array containing quiz questions
        String questions[] = {
                "Which language is used for Android Development?",
                "What is the capital of India?",
                "Which data structure uses FIFO?",
                "Which company developed Java?",
                "How many bits are there in a byte?"
        };

        // Options corresponding to each question
        String options[][] = {
                { "1. Python", "2. Java", "3. C", "4. PHP" },
                { "1. Mumbai", "2. Delhi", "3. Kolkata", "4. Chennai" },
                { "1. Stack", "2. Queue", "3. Tree", "4. Graph" },
                { "1. Microsoft", "2. Apple", "3. Sun Microsystems", "4. Google" },
                { "1. 4", "2. 8", "3. 16", "4. 32" }
        };

        // Correct answers for the questions
        int answers[] = { 2, 2, 2, 3, 2 };

        // Variable to store highest score in current session
        int highestScore = 0;

        int mainChoice;

        // Input player name
        System.out.println("Enter Your Name");
        String name = obj.nextLine();

        do {

            // Display main menu
            System.out.println("\n===== QUIZ APPLICATION =====");
            System.out.println("1. Start Quiz");
            System.out.println("2. Rules");
            System.out.println("3. Exit");
            System.out.println("Enter Choice");

            mainChoice = obj.nextInt();

            switch (mainChoice) {

                // Start Quiz
                case 1:

                    // Store user's answers
                    int userAnswers[] = new int[questions.length];

                    int correct = 0;
                    int wrong = 0;
                    int skipped = 0;

                    // Final score
                    double score = 0;

                    // Random object for shuffling questions
                    Random random = new Random();

                    // Array to store question order
                    int order[] = new int[questions.length];

                    // Initialize order array
                    for (int i = 0; i < questions.length; i++) {
                        order[i] = i;
                    }

                    // Shuffle question order
                    for (int i = 0; i < questions.length; i++) {

                        int j = random.nextInt(questions.length);

                        int temp = order[i];
                        order[i] = order[j];
                        order[j] = temp;
                    }

                    // Start timer
                    long startTime = System.currentTimeMillis();

                    // Display questions one by one
                    for (int i = 0; i < questions.length; i++) {

                        int q = order[i];

                        System.out.println("\nQuestion " + (i + 1));
                        System.out.println(questions[q]);

                        // Display options
                        for (int k = 0; k < 4; k++) {
                            System.out.println(options[q][k]);
                        }

                        System.out.println("Enter Answer (1-4) or 0 to Skip");

                        int choice = obj.nextInt();

                        userAnswers[q] = choice;

                        // Check answer
                        if (choice == 0) {

                            skipped++;
                            System.out.println("Question Skipped");

                        } else if (choice == answers[q]) {

                            correct++;
                            score += 1;

                            System.out.println("Correct!");

                        } else {

                            wrong++;
                            score -= 0.25;

                            System.out.println("Wrong!");
                            System.out.println("Correct Answer : "
                                    + answers[q]);
                        }
                    }

                    // End timer
                    long endTime = System.currentTimeMillis();

                    // Calculate time taken
                    long timeTaken = (endTime - startTime) / 1000;

                    // Calculate percentage
                    double percentage =
                            (score * 100.0) / questions.length;

                    // Assign grade
                    String grade;

                    if (percentage >= 90) {
                        grade = "A";
                    } else if (percentage >= 75) {
                        grade = "B";
                    } else if (percentage >= 60) {
                        grade = "C";
                    } else if (percentage >= 40) {
                        grade = "D";
                    } else {
                        grade = "F";
                    }

                    // Update highest score
                    if (correct > highestScore) {
                        highestScore = correct;
                    }

                    // Display result
                    System.out.println("\n===== RESULT =====");

                    System.out.println("Name : " + name);

                    System.out.println("Correct : " + correct);

                    System.out.println("Wrong : " + wrong);

                    System.out.println("Skipped : " + skipped);

                    System.out.println("Score : "
                            + score + "/" + questions.length);

                    System.out.println("Percentage : "
                            + percentage + "%");

                    System.out.println("Grade : " + grade);

                    // Display pass/fail status
                    if (percentage >= 40) {
                        System.out.println("Status : PASS");
                    } else {
                        System.out.println("Status : FAIL");
                    }

                    System.out.println("Time Taken : "
                            + timeTaken + " seconds");

                    System.out.println("Highest Score In Session : "
                            + highestScore);

                    // Review all answers
                    System.out.println("\n===== REVIEW ANSWERS =====");

                    for (int i = 0; i < questions.length; i++) {

                        System.out.println("\n" + questions[i]);

                        if (userAnswers[i] == 0) {

                            System.out.println(
                                    "Your Answer : Skipped");

                        } else {

                            System.out.println(
                                    "Your Answer : "
                                            + userAnswers[i]);
                        }

                        System.out.println(
                                "Correct Answer : "
                                        + answers[i]);
                    }

                    break;

                // Display Rules
                case 2:

                    System.out.println("\n===== RULES =====");

                    System.out.println("+1 for Correct Answer");

                    System.out.println("-0.25 for Wrong Answer");

                    System.out.println("0 for Skipped Question");

                    System.out.println("Pass Percentage = 40%");

                    System.out.println("Enter 0 to Skip a Question");

                    break;

                // Exit Program
                case 3:

                    System.out.println(
                            "Thank You For Playing");

                    break;

                // Invalid Choice
                default:

                    System.out.println(
                            "Invalid Choice");
            }

        } while (mainChoice != 3);

        // Close Scanner
        obj.close();
    }
}