import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            int a1 = scanner.nextInt();
            int b1 = scanner.nextInt();
            if (a1 > b1) a++;
            else if (a1 < b1) b++;
        }
        System.out.println(a + " " + b);
    }
}
