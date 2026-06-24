import java.util.Scanner;

public class Q115 {
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter a String");
    String str = obj.nextLine();

    int choice;

    do {

        System.out.println("\n===== STRING OPERATIONS SYSTEM =====");
        System.out.println("1. Display String");
        System.out.println("2. Length of String");
        System.out.println("3. Convert to Uppercase");
        System.out.println("4. Convert to Lowercase");
        System.out.println("5. Reverse String");
        System.out.println("6. Check Palindrome");
        System.out.println("7. Count Vowels");
        System.out.println("8. Count Words");
        System.out.println("9. Replace Word");
        System.out.println("10. Concatenate String");
        System.out.println("11. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();
        obj.nextLine();

        switch (choice) {

            // Display string
            case 1:

                System.out.println("String = " + str);
                break;

            // Length of string
            case 2:

                System.out.println(
                        "Length = " + str.length());

                break;

            // Convert to uppercase
            case 3:

                System.out.println(
                        str.toUpperCase());

                break;

            // Convert to lowercase
            case 4:

                System.out.println(
                        str.toLowerCase());

                break;

            // Reverse string
            case 5:

                String reverse = "";

                for (int i = str.length() - 1;
                     i >= 0;
                     i--) {

                    reverse += str.charAt(i);
                }

                System.out.println(
                        "Reverse = " + reverse);

                break;

            // Check palindrome
            case 6:

                reverse = "";

                for (int i = str.length() - 1;
                     i >= 0;
                     i--) {

                    reverse += str.charAt(i);
                }

                if (str.equalsIgnoreCase(reverse)) {

                    System.out.println(
                            "Palindrome");

                } else {

                    System.out.println(
                            "Not Palindrome");
                }

                break;

            // Count vowels
            case 7:

                int vowels = 0;

                for (int i = 0;
                     i < str.length();
                     i++) {

                    char ch =
                            Character.toLowerCase(
                                    str.charAt(i));

                    if (ch == 'a' ||
                            ch == 'e' ||
                            ch == 'i' ||
                            ch == 'o' ||
                            ch == 'u') {

                        vowels++;
                    }
                }

                System.out.println(
                        "Vowels = " + vowels);

                break;

            // Count words
            case 8:

                String words[] =
                        str.trim().split("\\s+");

                System.out.println(
                        "Words = " + words.length);

                break;

            // Replace word
            case 9:

                System.out.println(
                        "Enter Word To Replace");

                String oldWord =
                        obj.nextLine();

                System.out.println(
                        "Enter New Word");

                String newWord =
                        obj.nextLine();

                str = str.replace(
                        oldWord,
                        newWord);

                System.out.println(
                        "Updated String = "
                                + str);

                break;

            // Concatenate string
            case 10:

                System.out.println(
                        "Enter Another String");

                String str2 =
                        obj.nextLine();

                str = str.concat(
                        " " + str2);

                System.out.println(
                        "Updated String = "
                                + str);

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
