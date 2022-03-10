import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((a + b) % 2 != 0 || a < b) System.out.println("-1");
        else {
            int m = (a - b) / 2;
            int n = a - m;
            System.out.println(n + " " + m);
        }
    }
}