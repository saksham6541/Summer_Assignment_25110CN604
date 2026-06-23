import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Arrays to store employee details
        String name[] = new String[100];
        int id[] = new int[100];
        String department[] = new String[100];
        double salary[] = new double[100];

        // Number of employees currently stored
        int count = 0;
        int choice;

        do {

            // Main menu
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Annual Salary");
            System.out.println("7. Highest Paid Employee");
            System.out.println("8. Exit");

            System.out.println("Enter Choice");
            choice = obj.nextInt();

            switch (choice) {

                // Add employee record
                case 1:

                    obj.nextLine();

                    System.out.println("Enter Employee Name");
                    name[count] = obj.nextLine();

                    System.out.println("Enter Employee ID");
                    id[count] = obj.nextInt();

                    obj.nextLine();

                    System.out.println("Enter Department");
                    department[count] = obj.nextLine();

                    System.out.println("Enter Monthly Salary");
                    salary[count] = obj.nextDouble();

                    count++;

                    System.out.println("Employee Added Successfully");
                    break;

                // Display all employee records
                case 2:

                    if (count == 0) {
                        System.out.println("No Records Found");
                    } else {

                        System.out.println("\n===== EMPLOYEE RECORDS =====");

                        for (int i = 0; i < count; i++) {

                            System.out.println("Name : " + name[i]);
                            System.out.println("ID : " + id[i]);
                            System.out.println("Department : " + department[i]);
                            System.out.println("Salary : Rs." + salary[i]);
                            System.out.println();
                        }
                    }

                    break;

                // Search employee by ID
                case 3:

                    System.out.println("Enter Employee ID");
                    int searchId = obj.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == searchId) {

                            System.out.println("Name : " + name[i]);
                            System.out.println("Department : " + department[i]);
                            System.out.println("Salary : Rs." + salary[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found");
                    }

                    break;

                // Update employee information
                case 4:

                    System.out.println("Enter Employee ID");
                    int updateId = obj.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == updateId) {

                            obj.nextLine();

                            System.out.println("Enter New Name");
                            name[i] = obj.nextLine();

                            System.out.println("Enter New Department");
                            department[i] = obj.nextLine();

                            System.out.println("Enter New Salary");
                            salary[i] = obj.nextDouble();

                            found = true;

                            System.out.println("Record Updated Successfully");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found");
                    }

                    break;

                // Delete employee record
                case 5:

                    System.out.println("Enter Employee ID");
                    int deleteId = obj.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == deleteId) {

                            // Shift elements left after deletion
                            for (int j = i; j < count - 1; j++) {

                                name[j] = name[j + 1];
                                id[j] = id[j + 1];
                                department[j] = department[j + 1];
                                salary[j] = salary[j + 1];
                            }

                            count--;

                            found = true;

                            System.out.println("Record Deleted Successfully");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found");
                    }

                    break;

                // Calculate annual salary
                case 6:

                    System.out.println("Enter Employee ID");
                    int empId = obj.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == empId) {

                            System.out.println("Monthly Salary = Rs." + salary[i]);
                            System.out.println("Annual Salary = Rs." + (salary[i] * 12));

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found");
                    }

                    break;

                // Find highest paid employee
                case 7:

                    if (count == 0) {

                        System.out.println("No Records Found");

                    } else {

                        int highest = 0;

                        for (int i = 1; i < count; i++) {

                            if (salary[i] > salary[highest]) {
                                highest = i;
                            }
                        }

                        System.out.println("\n===== HIGHEST PAID EMPLOYEE =====");
                        System.out.println("Name : " + name[highest]);
                        System.out.println("ID : " + id[highest]);
                        System.out.println("Department : " + department[highest]);
                        System.out.println("Salary : Rs." + salary[highest]);
                    }

                    break;

                // Exit program
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
