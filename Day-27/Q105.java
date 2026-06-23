import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner obj = new Scanner(System.in);

        // Arrays to store student details
        String name[] = new String[100];
        int roll[] = new int[100];
        double marks[] = new double[100];

        // Keeps track of total students added
        int count = 0;
        int choice;

        do {

            // Display menu
            System.out.println("\n===== STUDENT RECORD MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Topper");
            System.out.println("7. Exit");

            System.out.println("Enter Choice");
            choice = obj.nextInt();

            switch (choice) {

                case 1:

                    // Add a new student record
                    obj.nextLine();

                    System.out.println("Enter Name");
                    name[count] = obj.nextLine();

                    System.out.println("Enter Roll Number");
                    roll[count] = obj.nextInt();

                    System.out.println("Enter Percentage");
                    marks[count] = obj.nextDouble();

                    count++;

                    System.out.println("Student Added Successfully");
                    break;

                case 2:

                    // Display all student records
                    if (count == 0) {

                        System.out.println("No Records Found");

                    } else {

                        System.out.println("\n===== STUDENT RECORDS =====");

                        for (int i = 0; i < count; i++) {

                            System.out.println(
                                    "Name : " + name[i] +
                                    " | Roll : " + roll[i] +
                                    " | Percentage : " + marks[i]);
                        }
                    }
                    break;

                case 3:

                    // Search student using roll number
                    System.out.println("Enter Roll Number");
                    int searchRoll = obj.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == searchRoll) {

                            System.out.println("Name : " + name[i]);
                            System.out.println("Percentage : " + marks[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 4:

                    // Update student details
                    System.out.println("Enter Roll Number");
                    int updateRoll = obj.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == updateRoll) {

                            obj.nextLine();

                            System.out.println("Enter New Name");
                            name[i] = obj.nextLine();

                            System.out.println("Enter New Percentage");
                            marks[i] = obj.nextDouble();

                            found = true;

                            System.out.println("Record Updated Successfully");

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 5:

                    // Delete a student record
                    System.out.println("Enter Roll Number");
                    int deleteRoll = obj.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == deleteRoll) {

                            // Shift all records one position left
                            for (int j = i; j < count - 1; j++) {

                                name[j] = name[j + 1];
                                roll[j] = roll[j + 1];
                                marks[j] = marks[j + 1];
                            }

                            count--;

                            found = true;

                            System.out.println("Record Deleted Successfully");

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 6:

                    // Find and display topper
                    if (count == 0) {

                        System.out.println("No Records Found");

                    } else {

                        // Assume first student is topper
                        int topper = 0;

                        // Find student with highest percentage
                        for (int i = 1; i < count; i++) {

                            if (marks[i] > marks[topper]) {
                                topper = i;
                            }
                        }

                        System.out.println("\n===== TOPPER =====");

                        System.out.println("Name : " + name[topper]);
                        System.out.println("Roll : " + roll[topper]);
                        System.out.println("Percentage : " + marks[topper]);
                    }

                    break;

                case 7:

                    // Exit program
                    System.out.println("Thank You");
                    break;

                default:

                    // Handle invalid menu choice
                    System.out.println("Invalid Choice");
            }

        } while (choice != 7);

        // Close scanner to free resources
        obj.close();
    }
}