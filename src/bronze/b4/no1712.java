package bronze.b4;

import java.util.Scanner;

public class no1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c <= b) System.out.println(-1);
        else {
            System.out.println((a / (c-b)) + 1);
        }
    }
}
