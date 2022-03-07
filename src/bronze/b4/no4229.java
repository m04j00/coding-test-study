package bronze.b4;

import java.util.Scanner;

public class no4229 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= b) System.out.println(-1);
        else {
            int m = (a - b) / 2;
            int n = a - m;

            System.out.println(n + " " + m);
        }
    }
}
// 점수 2 : 1 => 합 3 차 1  |  점수 3 : 2 => 합 5 차 1
// 점수 5 : 2 => 합 7 차 3  | 점수 13 : 9 => 합 22 차 4