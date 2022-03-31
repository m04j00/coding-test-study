import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int h = scanner.nextInt();
        int mMax = 0;
        int hMax = 0;
        for (int i = 0; i < m; i++) {
            mMax = Math.max(mMax, scanner.nextInt());
        }
        for (int i = 0; i < h; i++) {
            hMax = Math.max(hMax, scanner.nextInt());
        }
        System.out.println(mMax + hMax);
    }
}
