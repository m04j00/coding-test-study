import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 101;
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            int n = scanner.nextInt();
            if (n % 2 == 0) continue;
            if (n < min) min = n;
            sum += n;
        }
        if (sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
