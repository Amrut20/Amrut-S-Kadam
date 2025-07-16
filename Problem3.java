import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int count = (a % 2 == 0) ? (a - 1) : a;

        int num = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(num);
            if (i < count - 1) {
                System.out.print(", ");
            }
            num += 2;
        }

        sc.close();
    }
}
