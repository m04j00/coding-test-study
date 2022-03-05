package bronze.b5;

import java.util.Scanner;

public class no5522 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = 0;
        for(int i = 0; i < 5; i++){
            answer += scan.nextInt();
        }
        System.out.println(answer);
    }
}
