package bronze.b5;

import java.math.BigInteger;
import java.util.Scanner;

// 긴자리 계산
// https://www.acmicpc.net/problem/2338
public class no2338 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
