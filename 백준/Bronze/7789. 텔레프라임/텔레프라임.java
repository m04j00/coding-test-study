import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tel = scanner.nextInt();
        int newT = Integer.parseInt(scanner.next() + tel);

        for (int i = 2; i < Math.sqrt(tel); i++) {
            if (tel % i == 0) {
                System.out.println("No");
                return;
            }
        }

        for (int i = 2; i < Math.sqrt(newT); i++) {
            if (newT % i == 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
