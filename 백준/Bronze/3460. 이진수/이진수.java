import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            BigInteger n = scanner.nextBigInteger();
            position(n.toString(2));

        }
    }

    public static void position(String n) {
        if (!n.contains("1")) return;
        String[] binary = n.split("");
        int p = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            if (binary[i].equals("1")) System.out.print(p + " ");
            p++;
        }
        System.out.println();
    }
}
