import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int in = scanner.nextInt();
        int max = in;
        for (int i = 0; i < n; i++) {
            in += scanner.nextInt();
            in -= scanner.nextInt();
            if (in < 0) {
                System.out.println(0);
                return;
            }
            max = Math.max(max, in);
        }
        System.out.println(max);
    }
}
