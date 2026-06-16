import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a string");
        String str = sc.nextLine();

        char ch[] = str.toCharArray();
        int count = 0;

        // count characters
        for (int i = 0; i < ch.length; i++) {
            count++;
        }

        System.out.println("Length of the string = " + count);

        sc.close();
    }
}