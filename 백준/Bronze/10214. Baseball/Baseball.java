import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int yonsei = 0;
            int korea = 0;
            for (int j = 0; j < 9; j++) {
                yonsei += scanner.nextInt();
                korea += scanner.nextInt();
            }
            if (yonsei > korea) System.out.println("Yonsei");
            else if (yonsei < korea) System.out.println("Korea");
            else System.out.println("Draw");
        }
    }
}
