package bronze.b2;

import java.util.Scanner;

public class no2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] senCnt = new int[cnt];
        String[] sen = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            senCnt[i] = scan.nextInt();
            sen[i] = scan.next();
        }
        for (int i = 0; i < cnt; i++) {
            String[] sentence = sen[i].split("");

            for (String s : sentence) {
                for (int j = 0; j < senCnt[i]; j++) {
                    System.out.print(s);
                }
            }
            System.out.println();
        }


    }
}
