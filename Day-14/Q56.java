import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the size of the array");
        int n = sc.nextInt(); // input size

        int a[] = new int[n];

        // input elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // store frequency
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }

        System.out.println("Duplicate elements are");

        // display duplicates
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -- " + entry.getValue());
            }
        }
        sc.close();
    }
}