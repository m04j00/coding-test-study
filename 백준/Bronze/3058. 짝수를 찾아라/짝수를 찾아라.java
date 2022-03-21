import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int sum = 0;
            int min = 101;
            for (int j = 0; j < 7; j++) {
                int n = scanner.nextInt();
                if (n % 2 == 0) {
                    sum += n;
                    min = Math.min(min, n);
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}
