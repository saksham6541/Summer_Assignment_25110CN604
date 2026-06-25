import java.util.Scanner;

public class Q118 {
public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);

    // Arrays to store book details
    String title[] = new String[100];
    String author[] = new String[100];
    boolean issued[] = new boolean[100];

    int count = 0;
    int choice;

    do {

        System.out.println("\n===== MINI LIBRARY SYSTEM =====");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Search Book");
        System.out.println("4. Issue Book");
        System.out.println("5. Return Book");
        System.out.println("6. Count Available Books");
        System.out.println("7. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();

        switch (choice) {

            // Add book
            case 1:

                obj.nextLine();

                System.out.println("Enter Book Title");
                title[count] = obj.nextLine();

                System.out.println("Enter Author Name");
                author[count] = obj.nextLine();

                issued[count] = false;

                count++;

                System.out.println(
                        "Book Added Successfully");

                break;

            // View books
            case 2:

                if (count == 0) {

                    System.out.println(
                            "No Books Found");

                } else {

                    for (int i = 0; i < count; i++) {

                        System.out.println(
                                "\nTitle : "
                                        + title[i]);

                        System.out.println(
                                "Author : "
                                        + author[i]);

                        if (issued[i]) {

                            System.out.println(
                                    "Status : Issued");

                        } else {

                            System.out.println(
                                    "Status : Available");
                        }
                    }
                }

                break;

            // Search book
            case 3:

                obj.nextLine();

                System.out.println(
                        "Enter Book Title");

                String search =
                        obj.nextLine();

                boolean found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (title[i].equalsIgnoreCase(
                            search)) {

                        System.out.println(
                                "Author : "
                                        + author[i]);

                        if (issued[i]) {

                            System.out.println(
                                    "Status : Issued");

                        } else {

                            System.out.println(
                                    "Status : Available");
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Book Not Found");
                }

                break;

            // Issue book
            case 4:

                obj.nextLine();

                System.out.println(
                        "Enter Book Title");

                String issueBook =
                        obj.nextLine();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (title[i].equalsIgnoreCase(
                            issueBook)) {

                        if (issued[i]) {

                            System.out.println(
                                    "Book Already Issued");

                        } else {

                            issued[i] = true;

                            System.out.println(
                                    "Book Issued Successfully");
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Book Not Found");
                }

                break;

            // Return book
            case 5:

                obj.nextLine();

                System.out.println(
                        "Enter Book Title");

                String returnBook =
                        obj.nextLine();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (title[i].equalsIgnoreCase(
                            returnBook)) {

                        if (!issued[i]) {

                            System.out.println(
                                    "Book Already Available");

                        } else {

                            issued[i] = false;

                            System.out.println(
                                    "Book Returned Successfully");
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Book Not Found");
                }

                break;

            // Count available books
            case 6:

                int available = 0;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (!issued[i]) {
                        available++;
                    }
                }

                System.out.println(
                        "Available Books = "
                                + available);

                break;

            // Exit
            case 7:

                System.out.println(
                        "Thank You");

                break;

            default:

                System.out.println(
                        "Invalid Choice");
        }

    } while (choice != 7);

    obj.close();
}


}
