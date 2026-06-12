import java.util.Scanner;
import java.util.HashMap;

public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Input the size of the array");
        int n = sc.nextInt();

        int a[] = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input target value
        System.out.println("Input the Target ");
        int target = sc.nextInt();

        // Store elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        int result[] = { -1, -1 };

        // Find pair with required sum
        for (int i = 0; i < n; i++) {
            int complement = target - a[i];

            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }
            map.put(a[i], i);
        }

        // Display result indices
        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}