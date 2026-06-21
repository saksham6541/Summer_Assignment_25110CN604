import java.util.Scanner;

public class Q103 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner obj = new Scanner(System.in);

        // Initial PIN and Balance
        int pin = 1234;
        double balance = 10000;

        // Array to store transaction history
        String history[] = new String[100];
        int count = 0;

        int enteredPin;
        int attempts = 0;
        boolean access = false;

        // Allow maximum 3 PIN attempts
        while (attempts < 3) {
            System.out.println("Enter PIN");
            enteredPin = obj.nextInt();

            if (enteredPin == pin) {
                access = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN");
            }
        }

        // Block account after 3 wrong attempts
        if (!access) {
            System.out.println("Account Blocked");
            obj.close();
            return;
        }

        int choice;

        // ATM Menu Loop
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer Money");
            System.out.println("5. Change PIN");
            System.out.println("6. Mini Statement");
            System.out.println("7. Exit");

            System.out.println("Enter your choice");
            choice = obj.nextInt();

            switch (choice) {

                // Check Balance
                case 1:
                    System.out.println("Current Balance = Rs." + balance);
                    break;

                // Deposit Money
                case 2:
                    System.out.println("Enter amount to deposit");
                    double amount = obj.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid Amount");
                    } else {
                        balance += amount;
                        history[count++] = "Deposited Rs." + amount;

                        System.out.println("Deposit Successful");
                        System.out.println("Current Balance = Rs." + balance);
                    }
                    break;

                // Withdraw Money
                case 3:
                    System.out.println("Enter amount to withdraw");
                    amount = obj.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid Amount");
                    } else if (amount > balance) {
                        System.out.println("Insufficient Balance");
                    } else {
                        balance -= amount;
                        history[count++] = "Withdrawn Rs." + amount;

                        System.out.println("Withdrawal Successful");
                        System.out.println("Current Balance = Rs." + balance);
                    }
                    break;

                // Transfer Money
                case 4:
                    System.out.println("Enter Account Number");
                    long accNo = obj.nextLong();

                    System.out.println("Enter amount to transfer");
                    amount = obj.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid Amount");
                    } else if (amount > balance) {
                        System.out.println("Insufficient Balance");
                    } else {
                        balance -= amount;
                        history[count++] =
                                "Transferred Rs." + amount + " to A/C " + accNo;

                        System.out.println("Transfer Successful");
                        System.out.println("Current Balance = Rs." + balance);
                    }
                    break;

                // Change PIN
                case 5:
                    System.out.println("Enter Current PIN");
                    int oldPin = obj.nextInt();

                    if (oldPin == pin) {
                        System.out.println("Enter New PIN");
                        pin = obj.nextInt();

                        history[count++] = "PIN Changed";

                        System.out.println("PIN Updated Successfully");
                    } else {
                        System.out.println("Incorrect PIN");
                    }
                    break;

                // Display Transaction History
                case 6:
                    System.out.println("\n===== MINI STATEMENT =====");

                    if (count == 0) {
                        System.out.println("No Transactions Yet");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(history[i]);
                        }
                    }
                    break;

                // Exit ATM
                case 7:
                    System.out.println("Thank You For Using ATM");
                    break;

                // Invalid Choice
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 7);

        // Close Scanner
        obj.close();
    }
}