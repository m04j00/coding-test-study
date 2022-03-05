package bronze.b2;

import java.util.Scanner;

public class no11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        String[] sen = scan.next().split("");
        int answer = 0;
        for(int i = 0; i < cnt; i++){
            answer += Integer.parseInt(sen[i]);
        }
        System.out.println(answer);
    }
}
