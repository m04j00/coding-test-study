package bronze.b4;

import java.util.Scanner;

public class no5532 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        double kor = scanner.nextInt();
        double math = scanner.nextInt();
        int korP = scanner.nextInt();
        int mathP = scanner.nextInt();

        double korA = Math.ceil(kor / korP);
        double mathA = Math.ceil(math / mathP);

        int freeDay = day - (int) Math.max(korA, mathA);
        System.out.println(freeDay);
    }
}
