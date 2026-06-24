import java.util.Scanner;

public class Q114 {
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter Array Size");
    int n = obj.nextInt();

    int arr[] = new int[100];

    System.out.println("Enter Elements");

    for (int i = 0; i < n; i++) {
        arr[i] = obj.nextInt();
    }

    int choice;

    do {

        System.out.println("\n===== ARRAY OPERATIONS SYSTEM =====");
        System.out.println("1. Display Array");
        System.out.println("2. Insert Element");
        System.out.println("3. Delete Element");
        System.out.println("4. Search Element");
        System.out.println("5. Maximum Element");
        System.out.println("6. Minimum Element");
        System.out.println("7. Sum of Elements");
        System.out.println("8. Average");
        System.out.println("9. Sort Array");
        System.out.println("10. Reverse Array");
        System.out.println("11. Exit");

        System.out.println("Enter Choice");
        choice = obj.nextInt();

        switch (choice) {

            // Display array
            case 1:

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
                break;

            // Insert element
            case 2:

                System.out.println(
                        "Enter Position");

                int pos =
                        obj.nextInt();

                System.out.println(
                        "Enter Element");

                int element =
                        obj.nextInt();

                for (int i = n;
                     i > pos - 1;
                     i--) {

                    arr[i] = arr[i - 1];
                }

                arr[pos - 1] = element;

                n++;

                System.out.println(
                        "Element Inserted");

                break;

            // Delete element
            case 3:

                System.out.println(
                        "Enter Position");

                pos =
                        obj.nextInt();

                for (int i = pos - 1;
                     i < n - 1;
                     i++) {

                    arr[i] = arr[i + 1];
                }

                n--;

                System.out.println(
                        "Element Deleted");

                break;

            // Search element
            case 4:

                System.out.println(
                        "Enter Element");

                int key =
                        obj.nextInt();

                boolean found =
                        false;

                for (int i = 0;
                     i < n;
                     i++) {

                    if (arr[i] == key) {

                        System.out.println(
                                "Found At Position "
                                        + (i + 1));

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Element Not Found");
                }

                break;

            // Maximum element
            case 5:

                int max =
                        arr[0];

                for (int i = 1;
                     i < n;
                     i++) {

                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }

                System.out.println(
                        "Maximum = " + max);

                break;

            // Minimum element
            case 6:

                int min =
                        arr[0];

                for (int i = 1;
                     i < n;
                     i++) {

                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }

                System.out.println(
                        "Minimum = " + min);

                break;

            // Sum of elements
            case 7:

                int sum = 0;

                for (int i = 0;
                     i < n;
                     i++) {

                    sum += arr[i];
                }

                System.out.println(
                        "Sum = " + sum);

                break;

            // Average
            case 8:

                sum = 0;

                for (int i = 0;
                     i < n;
                     i++) {

                    sum += arr[i];
                }

                System.out.println(
                        "Average = "
                                + (double) sum / n);

                break;

            // Sort array
            case 9:

                for (int i = 0;
                     i < n - 1;
                     i++) {

                    for (int j = 0;
                         j < n - i - 1;
                         j++) {

                        if (arr[j] >
                                arr[j + 1]) {

                            int temp =
                                    arr[j];

                            arr[j] =
                                    arr[j + 1];

                            arr[j + 1] =
                                    temp;
                        }
                    }
                }

                System.out.println(
                        "Array Sorted");

                break;

            // Reverse array
            case 10:

                int start = 0;
                int end = n - 1;

                while (start < end) {

                    int temp =
                            arr[start];

                    arr[start] =
                            arr[end];

                    arr[end] =
                            temp;

                    start++;
                    end--;
                }

                System.out.println(
                        "Array Reversed");

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
