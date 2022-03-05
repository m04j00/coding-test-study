package bronze.b5;

import java.util.Scanner;

// R2
// https://www.acmicpc.net/problem/3046
public class no3046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int s = scan.nextInt();

        System.out.println(s * 2 - r1);
    }
}
