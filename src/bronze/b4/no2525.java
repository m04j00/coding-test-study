package bronze.b4;

import java.util.Scanner;

public class no2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();

        m += c;

        while(m >= 60){
            m -= 60;
            h++;
        }
        if (h >= 24) {
            h -= 24;
        }
        System.out.println(h + " " + m);
    }
}
