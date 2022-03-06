package bronze.b4;

import java.util.Scanner;

public class no3004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int r = a / 2 + 1;
        int c = a - r + 2;

        System.out.println(r * c);
    }
}
