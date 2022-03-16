import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int people = scanner.nextInt();
            BigInteger sum = new BigInteger("0");
            
            for (int j = 0; j < people; j++) {
                sum = sum.add(scanner.nextBigInteger());
            }
            
            String reminder = String.valueOf(sum.remainder(BigInteger.valueOf(people)));
            if (reminder.equals("0")) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
