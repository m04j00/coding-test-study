import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BigInteger a = scanner.nextBigInteger(2);
        BigInteger b = scanner.nextBigInteger(2);

        BigInteger multiply = a.multiply(b);
        String answer = multiply.toString(2);
        
        System.out.println(answer);


    }
}