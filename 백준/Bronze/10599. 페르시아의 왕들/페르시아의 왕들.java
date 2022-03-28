import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (a == 0 && b == 0 && c == 0 && d == 0) break;
            System.out.print(c - b + " ");
            System.out.println(d - a);
        }
    }
}
