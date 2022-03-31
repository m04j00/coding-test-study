import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int k = i;
            while (k != 0) {
                if (k % 10 == 3 || k % 10 == 6 || k % 10 == 9) cnt++;
                k /= 10;
            }
        }
        System.out.println(cnt);
    }
}
