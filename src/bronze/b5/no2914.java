package bronze.b5;

import java.util.Scanner;

// 저작권
// https://www.acmicpc.net/problem/2914
// ref. https://velog.io/@osk3856/BOJ-JAVA-Bronze5-2914
public class no2914 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int avg = scan.nextInt();

        System.out.println(num * (avg - 1) + 1);
    }
}
