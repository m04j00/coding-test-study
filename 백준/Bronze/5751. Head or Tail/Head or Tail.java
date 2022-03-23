import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;
            int m = 0;
            int j = 0;
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                if (x == 0) m++;
                else j++;
            }
            System.out.println("Mary won " + m + " times and John won " + j + " times");
        }
    }
}
