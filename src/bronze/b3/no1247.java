package bronze.b3;

import java.math.BigInteger;
import java.util.Scanner;

public class no1247 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            int n = scanner.nextInt();
            BigInteger cal = new BigInteger("0");
            for(int j = 0; j < n; j++){
                BigInteger num = new BigInteger(scanner.next());
                cal = cal.add(num);
            }
            if(cal.compareTo(BigInteger.valueOf(0)) == 0) System.out.println(0);
            else if(cal.compareTo(BigInteger.valueOf(0)) < 0) System.out.println("-");
            else System.out.println("+");
        }
    }
}
