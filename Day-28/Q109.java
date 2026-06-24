import java.util.Scanner;

public class Q109 {
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    // Arrays to store book details
    String title[] = new String[100];
    String author[] = new String[100];
    int bookId[] = new int[100];
    boolean issued[] = new boolean[100];

    int count = 0;
    int choice;

    do {

        System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Book");
        System.out.println("2. View All Books");
        System.out.println("3. Search Book");
        System.out.println("4. Issue Book");
        System.out.println("5. Return Book");
        System.out.println("6. Delete Book");
        System.out.println("7. Count Available Books");
        System.out.println("8. Display Issued Books");
        System.out.println("9. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();

        switch (choice) {

            // Add new book
            case 1:

                obj.nextLine();

                System.out.println("Enter Book Title");
                title[count] = obj.nextLine();

                System.out.println("Enter Author Name");
                author[count] = obj.nextLine();

                System.out.println("Enter Book ID");
                bookId[count] = obj.nextInt();

                issued[count] = false;

                count++;

                System.out.println("Book Added Successfully");
                break;

            // View all books
            case 2:

                if (count == 0) {

                    System.out.println("No Books Found");

                } else {

                    for (int i = 0; i < count; i++) {

                        System.out.println(
                                "\nBook ID : " + bookId[i]);

                        System.out.println(
                                "Title : " + title[i]);

                        System.out.println(
                                "Author : " + author[i]);

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

            // Search book by ID
            case 3:

                System.out.println("Enter Book ID");
                int searchId = obj.nextInt();

                boolean found = false;

                for (int i = 0; i < count; i++) {

                    if (bookId[i] == searchId) {

                        System.out.println(
                                "Title : " + title[i]);

                        System.out.println(
                                "Author : " + author[i]);

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
                    System.out.println("Book Not Found");
                }

                break;

            // Issue book
            case 4:

                System.out.println("Enter Book ID");
                int issueId = obj.nextInt();

                found = false;

                for (int i = 0; i < count; i++) {

                    if (bookId[i] == issueId) {

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

                System.out.println("Enter Book ID");
                int returnId = obj.nextInt();

                found = false;

                for (int i = 0; i < count; i++) {

                    if (bookId[i] == returnId) {

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

            // Delete book
            case 6:

                System.out.println("Enter Book ID");
                int deleteId = obj.nextInt();

                found = false;

                for (int i = 0; i < count; i++) {

                    if (bookId[i] == deleteId) {

                        for (int j = i;
                             j < count - 1;
                             j++) {

                            title[j] = title[j + 1];
                            author[j] = author[j + 1];
                            bookId[j] = bookId[j + 1];
                            issued[j] = issued[j + 1];
                        }

                        count--;

                        found = true;

                        System.out.println(
                                "Book Deleted Successfully");

                        break;
                    }
                }

                if (!found) {
                    System.out.println(
                            "Book Not Found");
                }

                break;

            // Count available books
            case 7:

                int available = 0;

                for (int i = 0; i < count; i++) {

                    if (!issued[i]) {
                        available++;
                    }
                }

                System.out.println(
                        "Available Books : "
                        + available);

                break;

            // Display issued books
            case 8:

                boolean anyIssued = false;

                System.out.println(
                        "\n===== ISSUED BOOKS =====");

                for (int i = 0; i < count; i++) {

                    if (issued[i]) {

                        System.out.println(
                                "Book ID : " +
                                bookId[i]);

                        System.out.println(
                                "Title : " +
                                title[i]);

                        System.out.println();

                        anyIssued = true;
                    }
                }

                if (!anyIssued) {

                    System.out.println(
                            "No Books Issued");
                }

                break;

            // Exit
            case 9:

                System.out.println(
                        "Thank You");

                break;

            default:

                System.out.println(
                        "Invalid Choice");
        }

    } while (choice != 9);

    obj.close();
}
}
