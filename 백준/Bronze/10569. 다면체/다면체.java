import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int v = scanner.nextInt();
            int e = scanner.nextInt();
            int answer = Math.abs(v - e - 2);
            System.out.println(answer);
        }
    }
}
