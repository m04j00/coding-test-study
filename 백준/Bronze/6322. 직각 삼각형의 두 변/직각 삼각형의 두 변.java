import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 1;
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a + b + c == 0) break;

            double answer = 0;
            double k = 0;
            char ch = 0;
            if (a == -1) {
                ch = 'a';
                k = Math.pow(c, 2) - Math.pow(b, 2);
                answer = Math.sqrt(k);
            } else if (b == -1) {
                ch = 'b';
                k = Math.pow(c, 2) - Math.pow(a, 2);
                answer = Math.sqrt(k);
            } else if (c == -1) {
                ch = 'c';
                k = Math.pow(a, 2) + Math.pow(b, 2);
                answer = Math.sqrt(k);
            }
            System.out.println("Triangle #" + cnt++);
            if (k <= 0) {
                System.out.println("Impossible.");
            } else {
                System.out.printf("%c = %.3f%n", ch, answer);
            }
            System.out.println();
        }
    }
}
