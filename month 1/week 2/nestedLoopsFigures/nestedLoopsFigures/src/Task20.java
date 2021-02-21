import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter N:");
            n = sc.nextInt();
        } while (n < 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = 0; j < (4 * n) - (4 * i) - 2; j++) {
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                if (j == n) {
                    System.out.print("");
                } else {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}
