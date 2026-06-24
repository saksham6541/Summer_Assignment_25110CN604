import java.util.Scanner;

public class Q111 {
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    // Arrays to store booking details
    String name[] = new String[100];
    int ticketId[] = new int[100];
    int seatNo[] = new int[100];

    int count = 0;
    int choice;

    int totalSeats = 50;
    double ticketPrice = 500;

    do {

        System.out.println("\n===== TICKET BOOKING SYSTEM =====");
        System.out.println("1. Book Ticket");
        System.out.println("2. View All Bookings");
        System.out.println("3. Search Booking");
        System.out.println("4. Cancel Ticket");
        System.out.println("5. Available Seats");
        System.out.println("6. Booked Seats");
        System.out.println("7. Total Revenue");
        System.out.println("8. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();

        switch (choice) {

            // Book ticket
            case 1:

                if (count == totalSeats) {

                    System.out.println("House Full");
                    break;
                }

                obj.nextLine();

                System.out.println("Enter Passenger Name");
                name[count] = obj.nextLine();

                System.out.println("Enter Ticket ID");
                ticketId[count] = obj.nextInt();

                System.out.println("Enter Seat Number");
                int seat = obj.nextInt();

                boolean seatTaken = false;

                for (int i = 0; i < count; i++) {

                    if (seatNo[i] == seat) {
                        seatTaken = true;
                        break;
                    }
                }

                if (seatTaken) {

                    System.out.println(
                            "Seat Already Booked");

                } else {

                    seatNo[count] = seat;

                    count++;

                    System.out.println(
                            "Ticket Booked Successfully");
                }

                break;

            // View all bookings
            case 2:

                if (count == 0) {

                    System.out.println(
                            "No Bookings Found");

                } else {

                    for (int i = 0; i < count; i++) {

                        System.out.println(
                                "\nPassenger : "
                                        + name[i]);

                        System.out.println(
                                "Ticket ID : "
                                        + ticketId[i]);

                        System.out.println(
                                "Seat Number : "
                                        + seatNo[i]);
                    }
                }

                break;

            // Search booking
            case 3:

                System.out.println(
                        "Enter Ticket ID");

                int searchId =
                        obj.nextInt();

                boolean found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (ticketId[i] ==
                            searchId) {

                        System.out.println(
                                "Passenger : "
                                        + name[i]);

                        System.out.println(
                                "Seat Number : "
                                        + seatNo[i]);

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Booking Not Found");
                }

                break;

            // Cancel ticket
            case 4:

                System.out.println(
                        "Enter Ticket ID");

                int cancelId =
                        obj.nextInt();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (ticketId[i] ==
                            cancelId) {

                        for (int j = i;
                             j < count - 1;
                             j++) {

                            name[j] =
                                    name[j + 1];

                            ticketId[j] =
                                    ticketId[j + 1];

                            seatNo[j] =
                                    seatNo[j + 1];
                        }

                        count--;

                        found = true;

                        System.out.println(
                                "Ticket Cancelled");

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Booking Not Found");
                }

                break;

            // Available seats
            case 5:

                System.out.println(
                        "Available Seats = "
                                + (totalSeats - count));

                break;

            // Display booked seats
            case 6:

                if (count == 0) {

                    System.out.println(
                            "No Seats Booked");

                } else {

                    System.out.println(
                            "Booked Seats:");

                    for (int i = 0;
                         i < count;
                         i++) {

                        System.out.println(
                                seatNo[i]);
                    }
                }

                break;

            // Calculate revenue
            case 7:

                double revenue =
                        count * ticketPrice;

                System.out.println(
                        "Total Revenue = Rs."
                                + revenue);

                break;

            // Exit
            case 8:

                System.out.println(
                        "Thank You");

                break;

            default:

                System.out.println(
                        "Invalid Choice");
        }

    } while (choice != 8);

    obj.close();
}

}
