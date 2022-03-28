import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            t -= scanner.nextInt();
            if (t < 0) break;
            cnt++;
        }
        System.out.println(cnt);
    }
}
