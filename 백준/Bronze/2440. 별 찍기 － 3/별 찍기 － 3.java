import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();

        for (int j = 0; j < cnt; j++) {
            for (int i = 0; i < cnt - j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
