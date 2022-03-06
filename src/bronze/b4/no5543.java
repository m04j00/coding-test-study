package bronze.b4;

import java.util.Arrays;
import java.util.Scanner;

public class no5543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int b3 = scanner.nextInt();
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();

        int[] b = {b1, b2, b3};
        Arrays.sort(b);

        int rowPrice = b[0] + Math.min(d1, d2) - 50;
        System.out.println(rowPrice);
    }
}
