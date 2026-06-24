import java.util.Scanner;

public class Q112 {
public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);

    // Arrays to store contact details
    String name[] = new String[100];
    long mobile[] = new long[100];
    String email[] = new String[100];
    boolean favourite[] = new boolean[100];

    int count = 0;
    int choice;

    do {

        System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Contact");
        System.out.println("2. View All Contacts");
        System.out.println("3. Search Contact");
        System.out.println("4. Update Contact");
        System.out.println("5. Delete Contact");
        System.out.println("6. Count Contacts");
        System.out.println("7. View Favourite Contacts");
        System.out.println("8. Mark/Unmark Favourite");
        System.out.println("9. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();

        switch (choice) {

            // Add contact
            case 1:

                obj.nextLine();

                System.out.println("Enter Name");
                name[count] = obj.nextLine();

                System.out.println("Enter Mobile Number");
                mobile[count] = obj.nextLong();

                obj.nextLine();

                System.out.println("Enter Email");
                email[count] = obj.nextLine();

                favourite[count] = false;

                count++;

                System.out.println(
                        "Contact Added Successfully");

                break;

            // View all contacts
            case 2:

                if (count == 0) {

                    System.out.println(
                            "No Contacts Found");

                } else {

                    for (int i = 0; i < count; i++) {

                        System.out.println(
                                "\nName : "
                                        + name[i]);

                        System.out.println(
                                "Mobile : "
                                        + mobile[i]);

                        System.out.println(
                                "Email : "
                                        + email[i]);

                        if (favourite[i]) {
                            System.out.println(
                                    "Favourite : Yes");
                        } else {
                            System.out.println(
                                    "Favourite : No");
                        }
                    }
                }

                break;

            // Search contact
            case 3:

                obj.nextLine();

                System.out.println(
                        "Enter Name");

                String search =
                        obj.nextLine();

                boolean found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (name[i].equalsIgnoreCase(
                            search)) {

                        System.out.println(
                                "Mobile : "
                                        + mobile[i]);

                        System.out.println(
                                "Email : "
                                        + email[i]);

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Contact Not Found");
                }

                break;

            // Update contact
            case 4:

                obj.nextLine();

                System.out.println(
                        "Enter Name");

                String update =
                        obj.nextLine();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (name[i].equalsIgnoreCase(
                            update)) {

                        System.out.println(
                                "Enter New Mobile");

                        mobile[i] =
                                obj.nextLong();

                        obj.nextLine();

                        System.out.println(
                                "Enter New Email");

                        email[i] =
                                obj.nextLine();

                        found = true;

                        System.out.println(
                                "Contact Updated");

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Contact Not Found");
                }

                break;

            // Delete contact
            case 5:

                obj.nextLine();

                System.out.println(
                        "Enter Name");

                String delete =
                        obj.nextLine();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (name[i].equalsIgnoreCase(
                            delete)) {

                        for (int j = i;
                             j < count - 1;
                             j++) {

                            name[j] = name[j + 1];
                            mobile[j] = mobile[j + 1];
                            email[j] = email[j + 1];
                            favourite[j] =
                                    favourite[j + 1];
                        }

                        count--;

                        found = true;

                        System.out.println(
                                "Contact Deleted");

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Contact Not Found");
                }

                break;

            // Count contacts
            case 6:

                System.out.println(
                        "Total Contacts : "
                                + count);

                break;

            // View favourite contacts
            case 7:

                boolean anyFav = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (favourite[i]) {

                        System.out.println(
                                "Name : "
                                        + name[i]);

                        System.out.println(
                                "Mobile : "
                                        + mobile[i]);

                        System.out.println();

                        anyFav = true;
                    }
                }

                if (!anyFav) {

                    System.out.println(
                            "No Favourite Contacts");
                }

                break;

            // Mark or unmark favourite
            case 8:

                obj.nextLine();

                System.out.println(
                        "Enter Name");

                String favName =
                        obj.nextLine();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (name[i].equalsIgnoreCase(
                            favName)) {

                        favourite[i] =
                                !favourite[i];

                        System.out.println(
                                "Favourite Status Updated");

                        found = true;

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Contact Not Found");
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
