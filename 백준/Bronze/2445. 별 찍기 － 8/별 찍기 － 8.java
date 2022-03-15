import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();

        for (int i = 0; i < cnt; i++) {
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (cnt - i - 1); j++) System.out.print(" ");
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = cnt - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (cnt - i); j++) System.out.print(" ");
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
