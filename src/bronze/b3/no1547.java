package bronze.b3;

import java.util.Scanner;

// 공
// https://www.acmicpc.net/problem/1547
public class no1547 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int location = 1;
        for (int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == location) location = b;
            else if (b == location) location = a;
        }
        System.out.println(location);
    }
}
