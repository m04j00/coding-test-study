package bronze.b4;

import java.util.Scanner;

public class no2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int answer = 0;
        if (a == b) {
            if (a == c) answer = a * 1000 + 10000;
            else answer = a * 100 + 1000;
        } else {
            if (a == c || b == c) answer = c * 100 + 1000;
            else {
                if(a > b && a > c) answer = a * 100;
                else if(b > a && b > c) answer = b * 100;
                else answer = c * 100;
            }
        }
        System.out.println(answer);
    }
}
