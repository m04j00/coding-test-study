package sliver.s5;

import java.util.Scanner;

public class no4150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;
        int f1 = 0;
        int f2 = 1;
        int d = 1234567;

        for(int i = 2; i <= n; i++){
            answer = (f1 + f2) % d;
            f1 = f2;
            f2 = answer;
        }

        System.out.println(answer);
    }
}
