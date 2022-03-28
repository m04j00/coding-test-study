import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = scanner.nextInt();
            String op = scanner.next();
            int b = scanner.nextInt();
            scanner.next();
            int answer = scanner.nextInt();
            int cal = 0;
            switch (op) {
                case "+":
                    cal = a + b;
                    break;
                case "-":
                    cal = a - b;
                    break;
            }
            System.out.print("Case " + i + ": ");
            if (answer == cal) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
