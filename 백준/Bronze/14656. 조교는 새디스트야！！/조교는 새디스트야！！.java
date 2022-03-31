import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int k = scanner.nextInt();
            if (i != k) cnt++;
        }
        System.out.println(cnt);
    }
}
