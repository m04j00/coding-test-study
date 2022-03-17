import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] cash = {25, 10, 5, 1};
        for (int i = 0; i < num; i++) {
            int c = scanner.nextInt();
            int[] cnt = new int[4];
            for (int j = 0; j < 4; j++) {
                cnt[j] = c / cash[j];
                if (cnt[j] != 0) c -= cash[j] * cnt[j];
            }
            System.out.println(cnt[0] + " " + cnt[1] + " " + cnt[2] + " " + cnt[3]);

        }
    }
}
