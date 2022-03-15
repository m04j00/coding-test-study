package bronze.b3;

import java.util.Scanner;

// 집 주소
public class no1284 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String num = scanner.next();
            if (num.equals("0")) break;
            int answer = num.length() + 1;
            for (int i = 0; i < num.length(); i++) {
                String n = num.substring(i, i + 1);
                if (n.equals("1")) answer += 2;
                else if (n.equals("0")) answer += 4;
                else answer += 3;
            }
            System.out.println(answer);
        }
    }
}
