package bronze.b3;

import java.util.Arrays;
import java.util.Scanner;

public class no1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int[] point = new int[4];
        point[0] = x;
        point[1] = y;
        point[2] = w - x;
        point[3] = h - y;
        Arrays.sort(point);
        System.out.println(point[0]);
    }
}
