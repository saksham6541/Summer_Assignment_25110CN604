import java.util.Scanner;

public class Q117 {
public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);

    // Arrays to store student details
    String name[] = new String[100];
    String course[] = new String[100];
    int roll[] = new int[100];
    double marks[] = new double[100];

    int count = 0;
    int choice;

    do {

        System.out.println("\n===== STUDENT RECORD SYSTEM =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Count Students");
        System.out.println("7. Display Topper");
        System.out.println("8. Sort By Name");
        System.out.println("9. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();

        switch (choice) {

            // Add student
            case 1:

                obj.nextLine();

                System.out.println("Enter Name");
                name[count] = obj.nextLine();

                System.out.println("Enter Course");
                course[count] = obj.nextLine();

                System.out.println("Enter Roll Number");
                roll[count] = obj.nextInt();

                System.out.println("Enter Marks");
                marks[count] = obj.nextDouble();

                count++;

                System.out.println(
                        "Student Added Successfully");

                break;

            // View students
            case 2:

                if (count == 0) {

                    System.out.println(
                            "No Records Found");

                } else {

                    for (int i = 0; i < count; i++) {

                        System.out.println(
                                "\nName : " + name[i]);

                        System.out.println(
                                "Course : " + course[i]);

                        System.out.println(
                                "Roll : " + roll[i]);

                        System.out.println(
                                "Marks : " + marks[i]);
                    }
                }

                break;

            // Search student by name
            case 3:

                obj.nextLine();

                System.out.println(
                        "Enter Student Name");

                String search =
                        obj.nextLine();

                boolean found = false;

                for (int i = 0; i < count; i++) {

                    if (name[i].equalsIgnoreCase(
                            search)) {

                        System.out.println(
                                "Course : " +
                                        course[i]);

                        System.out.println(
                                "Roll : " +
                                        roll[i]);

                        System.out.println(
                                "Marks : " +
                                        marks[i]);

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Student Not Found");
                }

                break;

            // Update student
            case 4:

                obj.nextLine();

                System.out.println(
                        "Enter Student Name");

                String update =
                        obj.nextLine();

                found = false;

                for (int i = 0; i < count; i++) {

                    if (name[i].equalsIgnoreCase(
                            update)) {

                        System.out.println(
                                "Enter New Course");

                        course[i] =
                                obj.nextLine();

                        System.out.println(
                                "Enter New Marks");

                        marks[i] =
                                obj.nextDouble();

                        found = true;

                        System.out.println(
                                "Record Updated");

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Student Not Found");
                }

                break;

            // Delete student
            case 5:

                obj.nextLine();

                System.out.println(
                        "Enter Student Name");

                String delete =
                        obj.nextLine();

                found = false;

                for (int i = 0; i < count; i++) {

                    if (name[i].equalsIgnoreCase(
                            delete)) {

                        for (int j = i;
                             j < count - 1;
                             j++) {

                            name[j] = name[j + 1];
                            course[j] = course[j + 1];
                            roll[j] = roll[j + 1];
                            marks[j] = marks[j + 1];
                        }

                        count--;

                        found = true;

                        System.out.println(
                                "Record Deleted");

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Student Not Found");
                }

                break;

            // Count students
            case 6:

                System.out.println(
                        "Total Students = "
                                + count);

                break;

            // Display topper
            case 7:

                if (count == 0) {

                    System.out.println(
                            "No Records Found");

                } else {

                    int topper = 0;

                    for (int i = 1;
                         i < count;
                         i++) {

                        if (marks[i] >
                                marks[topper]) {

                            topper = i;
                        }
                    }

                    System.out.println(
                            "Topper : "
                                    + name[topper]);

                    System.out.println(
                            "Marks : "
                                    + marks[topper]);
                }

                break;

            // Sort students by name
            case 8:

                for (int i = 0;
                     i < count - 1;
                     i++) {

                    for (int j = 0;
                         j < count - i - 1;
                         j++) {

                        if (name[j].compareToIgnoreCase(
                                name[j + 1]) > 0) {

                            String tempName =
                                    name[j];
                            name[j] =
                                    name[j + 1];
                            name[j + 1] =
                                    tempName;

                            String tempCourse =
                                    course[j];
                            course[j] =
                                    course[j + 1];
                            course[j + 1] =
                                    tempCourse;

                            int tempRoll =
                                    roll[j];
                            roll[j] =
                                    roll[j + 1];
                            roll[j + 1] =
                                    tempRoll;

                            double tempMarks =
                                    marks[j];
                            marks[j] =
                                    marks[j + 1];
                            marks[j + 1] =
                                    tempMarks;
                        }
                    }
                }

                System.out.println(
                        "Students Sorted By Name");

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
