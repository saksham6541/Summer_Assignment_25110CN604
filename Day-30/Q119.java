import java.util.Scanner;

public class Q119 {
public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);

    // Arrays to store employee details
    String name[] = new String[100];
    int id[] = new int[100];
    double salary[] = new double[100];

    int count = 0;
    int choice;

    do {

        System.out.println("\n===== MINI EMPLOYEE MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Search Employee");
        System.out.println("4. Update Salary");
        System.out.println("5. Delete Employee");
        System.out.println("6. Count Employees");
        System.out.println("7. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();

        switch (choice) {

            // Add employee
            case 1:

                obj.nextLine();

                System.out.println("Enter Employee Name");
                name[count] = obj.nextLine();

                System.out.println("Enter Employee ID");
                id[count] = obj.nextInt();

                System.out.println("Enter Salary");
                salary[count] = obj.nextDouble();

                count++;

                System.out.println(
                        "Employee Added Successfully");

                break;

            // View all employees
            case 2:

                if (count == 0) {

                    System.out.println(
                            "No Records Found");

                } else {

                    for (int i = 0; i < count; i++) {

                        System.out.println(
                                "\nName : "
                                        + name[i]);

                        System.out.println(
                                "ID : "
                                        + id[i]);

                        System.out.println(
                                "Salary : Rs."
                                        + salary[i]);
                    }
                }

                break;

            // Search employee
            case 3:

                System.out.println(
                        "Enter Employee ID");

                int searchId =
                        obj.nextInt();

                boolean found =
                        false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (id[i] ==
                            searchId) {

                        System.out.println(
                                "Name : "
                                        + name[i]);

                        System.out.println(
                                "Salary : Rs."
                                        + salary[i]);

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Employee Not Found");
                }

                break;

            // Update salary
            case 4:

                System.out.println(
                        "Enter Employee ID");

                int updateId =
                        obj.nextInt();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (id[i] ==
                            updateId) {

                        System.out.println(
                                "Enter New Salary");

                        salary[i] =
                                obj.nextDouble();

                        System.out.println(
                                "Salary Updated");

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Employee Not Found");
                }

                break;

            // Delete employee
            case 5:

                System.out.println(
                        "Enter Employee ID");

                int deleteId =
                        obj.nextInt();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (id[i] ==
                            deleteId) {

                        for (int j = i;
                             j < count - 1;
                             j++) {

                            name[j] =
                                    name[j + 1];

                            id[j] =
                                    id[j + 1];

                            salary[j] =
                                    salary[j + 1];
                        }

                        count--;

                        found = true;

                        System.out.println(
                                "Employee Deleted");

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Employee Not Found");
                }

                break;

            // Count employees
            case 6:

                System.out.println(
                        "Total Employees = "
                                + count);

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
