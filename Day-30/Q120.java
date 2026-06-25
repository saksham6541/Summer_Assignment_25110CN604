import java.util.Scanner;

public class Q120 {
    static String name[] = new String[100];
    static String course[] = new String[100];
    static int roll[] = new int[100];
    static double marks[] = new double[100];

    static int count = 0;

    // Add student
    public static void addStudent(Scanner obj) {

        obj.nextLine();

        System.out.println("Enter Student Name");
        name[count] = obj.nextLine();

        System.out.println("Enter Course");
        course[count] = obj.nextLine();

        System.out.println("Enter Roll Number");
        roll[count] = obj.nextInt();

        System.out.println("Enter Marks");
        marks[count] = obj.nextDouble();

        count++;

        System.out.println("Student Added Successfully");
    }

    // View all students
    public static void viewStudents() {

        if (count == 0) {

            System.out.println("No Records Found");

        } else {

            for (int i = 0; i < count; i++) {

                System.out.println("\nStudent " + (i + 1));

                System.out.println("Name : " + name[i]);
                System.out.println("Course : " + course[i]);
                System.out.println("Roll Number : " + roll[i]);
                System.out.println("Marks : " + marks[i]);
            }
        }
    }

    // Search student
    public static void searchStudent(Scanner obj) {

        obj.nextLine();

        System.out.println("Enter Student Name");
        String search = obj.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (name[i].equalsIgnoreCase(search)) {

                System.out.println("Name : " + name[i]);
                System.out.println("Course : " + course[i]);
                System.out.println("Roll Number : " + roll[i]);
                System.out.println("Marks : " + marks[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    // Update student
    public static void updateStudent(Scanner obj) {

        obj.nextLine();

        System.out.println("Enter Student Name");
        String update = obj.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (name[i].equalsIgnoreCase(update)) {

                System.out.println("Enter New Course");
                course[i] = obj.nextLine();

                System.out.println("Enter New Marks");
                marks[i] = obj.nextDouble();

                found = true;

                System.out.println("Record Updated Successfully");
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    // Delete student
    public static void deleteStudent(Scanner obj) {

        obj.nextLine();

        System.out.println("Enter Student Name");
        String delete = obj.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (name[i].equalsIgnoreCase(delete)) {

                for (int j = i; j < count - 1; j++) {

                    name[j] = name[j + 1];
                    course[j] = course[j + 1];
                    roll[j] = roll[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;

                found = true;

                System.out.println("Student Deleted Successfully");
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found");
        }
    }

    // Display topper
    public static void displayTopper() {

        if (count == 0) {

            System.out.println("No Records Found");

        } else {

            int topper = 0;

            for (int i = 1; i < count; i++) {

                if (marks[i] > marks[topper]) {
                    topper = i;
                }
            }

            System.out.println("\n===== TOPPER =====");
            System.out.println("Name : " + name[topper]);
            System.out.println("Course : " + course[topper]);
            System.out.println("Roll Number : " + roll[topper]);
            System.out.println("Marks : " + marks[topper]);
        }
    }

    // Count students
    public static void countStudents() {

        System.out.println("Total Students = " + count);
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Topper");
            System.out.println("7. Count Students");
            System.out.println("8. Exit");

            System.out.println("Enter Choice");
            choice = obj.nextInt();

            switch (choice) {

                case 1:
                    addStudent(obj);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent(obj);
                    break;

                case 4:
                    updateStudent(obj);
                    break;

                case 5:
                    deleteStudent(obj);
                    break;

                case 6:
                    displayTopper();
                    break;

                case 7:
                    countStudents();
                    break;

                case 8:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 8);

        obj.close();
    }

}
