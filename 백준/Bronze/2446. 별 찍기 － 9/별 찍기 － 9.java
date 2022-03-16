import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();

        for (int i = cnt; i > 0; i--) {
            for (int j = 0; j < cnt - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < cnt - 1; i++) {
            for (int k = cnt - 2; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
