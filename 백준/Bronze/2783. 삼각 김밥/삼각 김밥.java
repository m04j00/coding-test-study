import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sevenX = scanner.nextInt();
        int sevenY = scanner.nextInt();

        int n = scanner.nextInt();
        double min = (double) sevenX / sevenY;

        for (int i = 0; i < n; i++) {
            int conX = scanner.nextInt();
            int conY = scanner.nextInt();
            min = Math.min(min, (double) conX / conY);
        }
        System.out.println(Math.round(min * 1000 * 100) / 100.0);
    }
}
