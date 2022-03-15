package bronze.b3;

import java.util.Scanner;

public class no1212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            int a = Integer.parseInt(num.substring(i, i + 1));
            StringBuilder binary = new StringBuilder();
            while (a > 0) {
                binary.insert(0, (a % 2));
                a /= 2;
            }
            while (true) {
                if (binary.length() != 3) {
                    binary.insert(0, 0);
                } else break;
            }
            answer.append(binary);
        }


        while (true) {
            if (answer.length() == 1) break;
            if (answer.substring(0, 1).equals("0")) answer = new StringBuilder(answer.substring(1));
            else break;
        }
        System.out.println(answer);
    }
}
