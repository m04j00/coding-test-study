import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, b, c = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (n == 3) {
            c = scanner.nextInt();
        }
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                System.out.println(i);
            }
        }
    }
}
