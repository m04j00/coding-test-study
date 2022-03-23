import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int c = scanner.nextInt();
            int v = scanner.nextInt();
            int get = c / v;
            int dadG = c % v;
            System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n", get, dadG);
        }
    }
}
