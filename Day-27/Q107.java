import java.util.Scanner;

public class Q107 {
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    // Arrays to store employee salary details
    String name[] = new String[100];
    int id[] = new int[100];
    double salary[] = new double[100];

    int count = 0;
    int choice;

    do {

        System.out.println("\n===== SALARY MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employees");
        System.out.println("3. Search Employee");
        System.out.println("4. Calculate Net Salary");
        System.out.println("5. Give Bonus");
        System.out.println("6. Increase Salary");
        System.out.println("7. Highest Salary Employee");
        System.out.println("8. Average Salary");
        System.out.println("9. Total Salary Expense");
        System.out.println("10. Delete Employee");
        System.out.println("11. Exit");

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

                System.out.println("Enter Basic Salary");
                salary[count] = obj.nextDouble();

                count++;

                System.out.println("Employee Added Successfully");
                break;

            // View all employees
            case 2:

                if (count == 0) {

                    System.out.println("No Records Found");

                } else {

                    for (int i = 0; i < count; i++) {

                        System.out.println("Name : " + name[i]);
                        System.out.println("ID : " + id[i]);
                        System.out.println("Salary : Rs." + salary[i]);
                        System.out.println();
                    }
                }

                break;

            // Search employee
            case 3:

                System.out.println("Enter Employee ID");
                int searchId = obj.nextInt();

                boolean found = false;

                for (int i = 0; i < count; i++) {

                    if (id[i] == searchId) {

                        System.out.println("Name : " + name[i]);
                        System.out.println("Salary : Rs." + salary[i]);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee Not Found");
                }

                break;

            // Calculate net salary after 10% deduction
            case 4:

                System.out.println("Enter Employee ID");
                int empId = obj.nextInt();

                found = false;

                for (int i = 0; i < count; i++) {

                    if (id[i] == empId) {

                        double deduction =
                                salary[i] * 0.10;

                        double netSalary =
                                salary[i] - deduction;

                        System.out.println(
                                "Net Salary = Rs."
                                + netSalary);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee Not Found");
                }

                break;

            // Give bonus
            case 5:

                System.out.println("Enter Employee ID");
                empId = obj.nextInt();

                found = false;

                for (int i = 0; i < count; i++) {

                    if (id[i] == empId) {

                        double bonus =
                                salary[i] * 0.20;

                        System.out.println(
                                "Bonus = Rs."
                                + bonus);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee Not Found");
                }

                break;

            // Increase salary
            case 6:

                System.out.println("Enter Employee ID");
                empId = obj.nextInt();

                found = false;

                for (int i = 0; i < count; i++) {

                    if (id[i] == empId) {

                        System.out.println(
                                "Enter Increment Amount");

                        double inc =
                                obj.nextDouble();

                        salary[i] += inc;

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

            // Highest salary employee
            case 7:

                if (count == 0) {

                    System.out.println(
                            "No Records Found");

                } else {

                    int highest = 0;

                    for (int i = 1;
                         i < count;
                         i++) {

                        if (salary[i] >
                                salary[highest]) {

                            highest = i;
                        }
                    }

                    System.out.println(
                            "Name : "
                            + name[highest]);

                    System.out.println(
                            "Salary : Rs."
                            + salary[highest]);
                }

                break;

            // Average salary
            case 8:

                if (count == 0) {

                    System.out.println(
                            "No Records Found");

                } else {

                    double sum = 0;

                    for (int i = 0;
                         i < count;
                         i++) {

                        sum += salary[i];
                    }

                    System.out.println(
                            "Average Salary = Rs."
                            + (sum / count));
                }

                break;

            // Total company salary expense
            case 9:

                double total = 0;

                for (int i = 0;
                     i < count;
                     i++) {

                    total += salary[i];
                }

                System.out.println(
                        "Total Salary Expense = Rs."
                        + total);

                break;

            // Delete employee
            case 10:

                System.out.println(
                        "Enter Employee ID");

                int deleteId =
                        obj.nextInt();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (id[i] == deleteId) {

                        for (int j = i;
                             j < count - 1;
                             j++) {

                            name[j] = name[j + 1];
                            id[j] = id[j + 1];
                            salary[j] =
                                    salary[j + 1];
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
                            "Employee Not Found");
                }

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
