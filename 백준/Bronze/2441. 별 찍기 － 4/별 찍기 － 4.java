import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();

        for (int i = 0; i < cnt; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = cnt - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
