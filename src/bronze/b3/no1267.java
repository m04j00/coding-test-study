package bronze.b3;

import java.util.Scanner;

// 핸드폰 요금
// https://www.acmicpc.net/problem/1267
public class no1267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] charge = new int[num];

        for (int i = 0; i < num; i++) {
            charge[i] = scanner.nextInt();
        }
        int y = 0;
        for (int i : charge) {
            y += (i / 30) * 10;
            y += 10;
        }

        int m = 0;
        for (int i : charge) {
            m += (i / 60) * 15;
            m += 15;
        }
        if (y == m) {
            System.out.println("Y M " + y);
        } else if (y < m) {
            System.out.println("Y " + y);
        } else {
            System.out.println("M " + m);
        }
    }
}
