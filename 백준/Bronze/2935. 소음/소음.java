import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        String op = scanner.next();
        BigInteger b = scanner.nextBigInteger();

        switch (op) {
            case "+":
                System.out.println(a.add(b));
                break;
            case "*":
                System.out.println(a.multiply(b));
                break;
        }
    }
}
