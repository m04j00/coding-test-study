import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            int c = scanner.nextInt();
            if (d == c) cnt++;
        }

        System.out.println(cnt);

    }
}
