import java.util.Scanner;

public class Q110 {
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    // Arrays to store account details
    String name[] = new String[100];
    long accountNo[] = new long[100];
    double balance[] = new double[100];

    int count = 0;
    int choice;

    do {

        System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
        System.out.println("1. Create Account");
        System.out.println("2. View All Accounts");
        System.out.println("3. Search Account");
        System.out.println("4. Deposit Money");
        System.out.println("5. Withdraw Money");
        System.out.println("6. Transfer Money");
        System.out.println("7. Calculate Interest");
        System.out.println("8. Richest Customer");
        System.out.println("9. Delete Account");
        System.out.println("10. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();

        switch (choice) {

            // Create new account
            case 1:

                obj.nextLine();

                System.out.println("Enter Customer Name");
                name[count] = obj.nextLine();

                System.out.println("Enter Account Number");
                accountNo[count] = obj.nextLong();

                System.out.println("Enter Initial Balance");
                balance[count] = obj.nextDouble();

                count++;

                System.out.println("Account Created Successfully");
                break;

            // Display all accounts
            case 2:

                if (count == 0) {

                    System.out.println("No Accounts Found");

                } else {

                    for (int i = 0; i < count; i++) {

                        System.out.println("\nName : "
                                + name[i]);

                        System.out.println("Account No : "
                                + accountNo[i]);

                        System.out.println("Balance : Rs."
                                + balance[i]);
                    }
                }

                break;

            // Search account
            case 3:

                System.out.println("Enter Account Number");
                long searchAcc = obj.nextLong();

                boolean found = false;

                for (int i = 0; i < count; i++) {

                    if (accountNo[i] == searchAcc) {

                        System.out.println("Name : "
                                + name[i]);

                        System.out.println("Balance : Rs."
                                + balance[i]);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Account Not Found");
                }

                break;

            // Deposit money
            case 4:

                System.out.println("Enter Account Number");
                long depAcc = obj.nextLong();

                found = false;

                for (int i = 0; i < count; i++) {

                    if (accountNo[i] == depAcc) {

                        System.out.println(
                                "Enter Amount");

                        double amount =
                                obj.nextDouble();

                        balance[i] += amount;

                        System.out.println(
                                "Deposit Successful");

                        System.out.println(
                                "New Balance = Rs."
                                        + balance[i]);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println(
                            "Account Not Found");
                }

                break;

            // Withdraw money
            case 5:

                System.out.println(
                        "Enter Account Number");

                long withAcc =
                        obj.nextLong();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (accountNo[i] ==
                            withAcc) {

                        System.out.println(
                                "Enter Amount");

                        double amount =
                                obj.nextDouble();

                        if (amount >
                                balance[i]) {

                            System.out.println(
                                    "Insufficient Balance");

                        } else {

                            balance[i] -= amount;

                            System.out.println(
                                    "Withdrawal Successful");

                            System.out.println(
                                    "New Balance = Rs."
                                            + balance[i]);
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Account Not Found");
                }

                break;

            // Transfer money
            case 6:

                System.out.println(
                        "Enter Sender Account");

                long sender =
                        obj.nextLong();

                System.out.println(
                        "Enter Receiver Account");

                long receiver =
                        obj.nextLong();

                System.out.println(
                        "Enter Amount");

                double amount =
                        obj.nextDouble();

                int senderIndex = -1;
                int receiverIndex = -1;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (accountNo[i] ==
                            sender) {

                        senderIndex = i;
                    }

                    if (accountNo[i] ==
                            receiver) {

                        receiverIndex = i;
                    }
                }

                if (senderIndex == -1 ||
                        receiverIndex == -1) {

                    System.out.println(
                            "Invalid Account Number");

                } else if (amount >
                        balance[senderIndex]) {

                    System.out.println(
                            "Insufficient Balance");

                } else {

                    balance[senderIndex] -= amount;

                    balance[receiverIndex] += amount;

                    System.out.println(
                            "Transfer Successful");
                }

                break;

            // Calculate interest
            case 7:

                System.out.println(
                        "Enter Account Number");

                long intAcc =
                        obj.nextLong();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (accountNo[i] ==
                            intAcc) {

                        double interest =
                                balance[i] * 0.05;

                        System.out.println(
                                "Annual Interest = Rs."
                                        + interest);

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Account Not Found");
                }

                break;

            // Richest customer
            case 8:

                if (count == 0) {

                    System.out.println(
                            "No Accounts Found");

                } else {

                    int richest = 0;

                    for (int i = 1;
                         i < count;
                         i++) {

                        if (balance[i] >
                                balance[richest]) {

                            richest = i;
                        }
                    }

                    System.out.println(
                            "Name : "
                                    + name[richest]);

                    System.out.println(
                            "Balance : Rs."
                                    + balance[richest]);
                }

                break;

            // Delete account
            case 9:

                System.out.println(
                        "Enter Account Number");

                long deleteAcc =
                        obj.nextLong();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (accountNo[i] ==
                            deleteAcc) {

                        for (int j = i;
                             j < count - 1;
                             j++) {

                            name[j] = name[j + 1];
                            accountNo[j] =
                                    accountNo[j + 1];
                            balance[j] =
                                    balance[j + 1];
                        }

                        count--;

                        found = true;

                        System.out.println(
                                "Account Deleted");

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Account Not Found");
                }

                break;

            // Exit
            case 10:

                System.out.println(
                        "Thank You");

                break;

            default:

                System.out.println(
                        "Invalid Choice");
        }

    } while (choice != 10);

    obj.close();
}

}
