package bronze.b4;

import java.math.BigInteger;
import java.util.Scanner;

public class no2420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger m = scanner.nextBigInteger();
        BigInteger n = scanner.nextBigInteger();
        BigInteger sub = m.subtract(n);
        System.out.println(sub.abs());
    }
}
