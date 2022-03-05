package bronze.b2;

import java.util.Scanner;

public class no1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sen = scan.nextLine().split(" ");
        int answer = 0;

        for (String s : sen) {
            if (s.length() != 0) answer++;
        }

        System.out.println(answer);
    }
}
