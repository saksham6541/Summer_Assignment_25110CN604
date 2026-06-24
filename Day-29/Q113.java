import java.util.Scanner;

public class Q113 {
public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);

    int choice;

    do {

        System.out.println("\n===== MENU DRIVEN CALCULATOR =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        System.out.println("7. Square Root");
        System.out.println("8. Factorial");
        System.out.println("9. Maximum");
        System.out.println("10. Minimum");
        System.out.println("11. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();

        switch (choice) {

            // Addition
            case 1:

                System.out.println("Enter Two Numbers");

                double a = obj.nextDouble();
                double b = obj.nextDouble();

                System.out.println(
                        "Result = " + (a + b));

                break;

            // Subtraction
            case 2:

                System.out.println("Enter Two Numbers");

                a = obj.nextDouble();
                b = obj.nextDouble();

                System.out.println(
                        "Result = " + (a - b));

                break;

            // Multiplication
            case 3:

                System.out.println("Enter Two Numbers");

                a = obj.nextDouble();
                b = obj.nextDouble();

                System.out.println(
                        "Result = " + (a * b));

                break;

            // Division
            case 4:

                System.out.println("Enter Two Numbers");

                a = obj.nextDouble();
                b = obj.nextDouble();

                if (b == 0) {

                    System.out.println(
                            "Division By Zero Not Allowed");

                } else {

                    System.out.println(
                            "Result = " + (a / b));
                }

                break;

            // Modulus
            case 5:

                System.out.println("Enter Two Numbers");

                a = obj.nextDouble();
                b = obj.nextDouble();

                System.out.println(
                        "Result = " + (a % b));

                break;

            // Power
            case 6:

                System.out.println("Enter Base");

                a = obj.nextDouble();

                System.out.println("Enter Exponent");

                b = obj.nextDouble();

                System.out.println(
                        "Result = " +
                        Math.pow(a, b));

                break;

            // Square root
            case 7:

                System.out.println(
                        "Enter Number");

                a = obj.nextDouble();

                if (a < 0) {

                    System.out.println(
                            "Invalid Input");

                } else {

                    System.out.println(
                            "Result = " +
                            Math.sqrt(a));
                }

                break;

            // Factorial
            case 8:

                System.out.println(
                        "Enter Number");

                int n =
                        obj.nextInt();

                long fact = 1;

                for (int i = 1;
                     i <= n;
                     i++) {

                    fact *= i;
                }

                System.out.println(
                        "Factorial = " +
                        fact);

                break;

            // Maximum
            case 9:

                System.out.println(
                        "Enter Two Numbers");

                a = obj.nextDouble();
                b = obj.nextDouble();

                System.out.println(
                        "Maximum = " +
                        Math.max(a, b));

                break;

            // Minimum
            case 10:

                System.out.println(
                        "Enter Two Numbers");

                a = obj.nextDouble();
                b = obj.nextDouble();

                System.out.println(
                        "Minimum = " +
                        Math.min(a, b));

                break;

            // Exit
            case 11:

                System.out.println(
                        "Thank You");

                break;

            default:

                System.out.println(
                        "Invalid Choice");
        }

    } while (choice != 11);

    obj.close();
}
}
