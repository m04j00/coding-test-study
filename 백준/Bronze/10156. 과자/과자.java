import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int total = k * n;
        int need = total - m;

        if (need < 0) System.out.println(0);
        else System.out.println(need);
    }
}
