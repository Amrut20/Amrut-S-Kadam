import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        System.out.println(countMap);

        sc.close();
    }
}
