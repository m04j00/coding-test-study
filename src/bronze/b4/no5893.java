package bronze.b4;

import java.math.BigInteger;
import java.util.Scanner;

public class no5893 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        if(!a.contains("1")) System.out.println("0");
        else{
            BigInteger tenMul17 = twoToTen(a).multiply(BigInteger.valueOf(17));
            String two17 = tenToTwo(tenMul17);
            System.out.println(two17);
        }

    }
    // 2진수 -> 10진수
    public static BigInteger twoToTen(String two){
        BigInteger sum = new BigInteger("0");
        BigInteger i = new BigInteger("1");

        while (two.length() != 0) {
            int num = Integer.parseInt(two.substring(two.length() -1));
            sum = sum.add(i.multiply(BigInteger.valueOf(num)));// 1의 자리 수와 i 곱하여 더함
            i = i.multiply(BigInteger.valueOf(2)); // 2진수이기에 i에 2를 곱해줌
            two = two.substring(0, two.length() - 1);
        }
        return sum;
    }

    // 10진수 -> 2진수
    public static String tenToTwo(BigInteger ten) {
        StringBuilder binary = new StringBuilder();

        while (ten.compareTo(BigInteger.valueOf(0)) == 1) {
            // String binary = (a % 2) + binary;
            binary.insert(0, (ten.remainder(BigInteger.valueOf(2))));
            ten = ten.divide(BigInteger.valueOf(2));
        }
        return binary.toString();
    }
}
