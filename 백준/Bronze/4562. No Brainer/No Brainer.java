import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        while (n != cnt) {
            cnt++;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) System.out.println("NO BRAINS");
            else System.out.println("MMM BRAINS");
        }
    }
}
