import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            int c = scanner.nextInt();
            if (answer == c) cnt++;
        }

        System.out.println(cnt);

    }
}
