import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        int before = 2;
        for (int i = 0; i < n; i++) {
            int milk = scanner.nextInt();
            if (milk == 0 && before == 2) {
                cnt++;
                before = milk;
            } else if (milk == 1 && before == 0) {
                cnt++;
                before = milk;
            } else if (milk == 2 && before == 1) {
                cnt++;
                before = milk;
            }

        }
        System.out.println(cnt);
    }
}
