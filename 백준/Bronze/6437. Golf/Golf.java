import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 1;
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a + b == 0) break;
            System.out.println("Hole #" + cnt++);
            if (a == b) System.out.println("Par.");
            else if (a > b) {
                if (b == 1) System.out.println("Hole-in-one.");
                else if (a - 1 == b) System.out.println("Birdie.");
                else if (a - 2 == b) System.out.println("Eagle.");
                else System.out.println("Double eagle.");
            } else {
                if (a == b - 1) System.out.println("Bogey.");
                else System.out.println("Double Bogey.");
            }
            System.out.println();
        }
    }
}
