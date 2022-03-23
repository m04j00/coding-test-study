import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 100;
        int b = 100;

        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            int c = scanner.nextInt();
            if (s > c) b -= s;
            else if (s < c) a -= c;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
