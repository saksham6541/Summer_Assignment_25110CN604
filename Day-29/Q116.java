import java.util.Scanner;

public class Q116 {
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    // Arrays to store product details
    String productName[] = new String[100];
    int productId[] = new int[100];
    int quantity[] = new int[100];
    double price[] = new double[100];

    int count = 0;
    int choice;

    do {

        System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Product");
        System.out.println("2. View Products");
        System.out.println("3. Search Product");
        System.out.println("4. Update Quantity");
        System.out.println("5. Sell Product");
        System.out.println("6. Delete Product");
        System.out.println("7. Low Stock Alert");
        System.out.println("8. Total Inventory Value");
        System.out.println("9. Most Expensive Product");
        System.out.println("10. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();

        switch (choice) {

            // Add product
            case 1:

                obj.nextLine();

                System.out.println("Enter Product Name");
                productName[count] = obj.nextLine();

                System.out.println("Enter Product ID");
                productId[count] = obj.nextInt();

                System.out.println("Enter Quantity");
                quantity[count] = obj.nextInt();

                System.out.println("Enter Price");
                price[count] = obj.nextDouble();

                count++;

                System.out.println(
                        "Product Added Successfully");

                break;

            // View all products
            case 2:

                if (count == 0) {

                    System.out.println(
                            "No Products Found");

                } else {

                    for (int i = 0; i < count; i++) {

                        System.out.println(
                                "\nProduct Name : "
                                        + productName[i]);

                        System.out.println(
                                "Product ID : "
                                        + productId[i]);

                        System.out.println(
                                "Quantity : "
                                        + quantity[i]);

                        System.out.println(
                                "Price : Rs."
                                        + price[i]);
                    }
                }

                break;

            // Search product
            case 3:

                System.out.println(
                        "Enter Product ID");

                int searchId =
                        obj.nextInt();

                boolean found =
                        false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (productId[i] ==
                            searchId) {

                        System.out.println(
                                "Name : "
                                        + productName[i]);

                        System.out.println(
                                "Quantity : "
                                        + quantity[i]);

                        System.out.println(
                                "Price : Rs."
                                        + price[i]);

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Product Not Found");
                }

                break;

            // Update quantity
            case 4:

                System.out.println(
                        "Enter Product ID");

                int updateId =
                        obj.nextInt();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (productId[i] ==
                            updateId) {

                        System.out.println(
                                "Enter New Quantity");

                        quantity[i] =
                                obj.nextInt();

                        System.out.println(
                                "Quantity Updated");

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Product Not Found");
                }

                break;

            // Sell product
            case 5:

                System.out.println(
                        "Enter Product ID");

                int sellId =
                        obj.nextInt();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (productId[i] ==
                            sellId) {

                        System.out.println(
                                "Enter Quantity To Sell");

                        int sold =
                                obj.nextInt();

                        if (sold >
                                quantity[i]) {

                            System.out.println(
                                    "Insufficient Stock");

                        } else {

                            quantity[i] -= sold;

                            System.out.println(
                                    "Sale Successful");

                            System.out.println(
                                    "Bill Amount = Rs."
                                            + (sold * price[i]));
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Product Not Found");
                }

                break;

            // Delete product
            case 6:

                System.out.println(
                        "Enter Product ID");

                int deleteId =
                        obj.nextInt();

                found = false;

                for (int i = 0;
                     i < count;
                     i++) {

                    if (productId[i] ==
                            deleteId) {

                        for (int j = i;
                             j < count - 1;
                             j++) {

                            productName[j] =
                                    productName[j + 1];

                            productId[j] =
                                    productId[j + 1];

                            quantity[j] =
                                    quantity[j + 1];

                            price[j] =
                                    price[j + 1];
                        }

                        count--;

                        found = true;

                        System.out.println(
                                "Product Deleted");

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Product Not Found");
                }

                break;

            // Low stock alert
            case 7:

                boolean lowStock =
                        false;

                System.out.println(
                        "\nProducts With Low Stock");

                for (int i = 0;
                     i < count;
                     i++) {

                    if (quantity[i] < 5) {

                        System.out.println(
                                productName[i]
                                        + " : "
                                        + quantity[i]);

                        lowStock = true;
                    }
                }

                if (!lowStock) {

                    System.out.println(
                            "No Low Stock Products");
                }

                break;

            // Total inventory value
            case 8:

                double totalValue = 0;

                for (int i = 0;
                     i < count;
                     i++) {

                    totalValue +=
                            quantity[i] * price[i];
                }

                System.out.println(
                        "Total Inventory Value = Rs."
                                + totalValue);

                break;

            // Most expensive product
            case 9:

                if (count == 0) {

                    System.out.println(
                            "No Products Found");

                } else {

                    int expensive = 0;

                    for (int i = 1;
                         i < count;
                         i++) {

                        if (price[i] >
                                price[expensive]) {

                            expensive = i;
                        }
                    }

                    System.out.println(
                            "Product : "
                                    + productName[expensive]);

                    System.out.println(
                            "Price : Rs."
                                    + price[expensive]);
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
