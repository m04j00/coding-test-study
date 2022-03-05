package bronze.b5;

import java.util.Scanner;

public class no2475 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] code = scan.nextLine().split(" ");
        int answer = 0;
        for(String s : code){
            answer += Math.pow(Integer.parseInt(s), 2);
        }
        System.out.println(answer % 10);
    }
}
