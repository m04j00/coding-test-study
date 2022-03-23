import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int answer = scanner.nextInt();
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                int q = scanner.nextInt();
                answer += q * scanner.nextInt();
            }
            System.out.println(answer);
        }
    }
}
