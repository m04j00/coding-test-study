package bronze.b4;

import java.util.Scanner;

public class no1297 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int h = scan.nextInt();
        int w = scan.nextInt();

        double rD = Math.sqrt(h * h + w * w);

        int xH = (int) (d * h / rD);
        int xW = (int) (d * w / rD);
        System.out.println(xH + " " + xW);
    }
}
