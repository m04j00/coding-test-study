import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % x == 0 && i % y == 0) System.out.println("FizzBuzz");
            else if (i % x == 0) System.out.println("Fizz");
            else if (i % y == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
