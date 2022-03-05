package bronze.b5;

import java.util.Scanner;

public class no2845 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int person = scan.nextInt();
        int area = scan.nextInt();
        scan.nextLine();
        String[] article = scan.nextLine().split(" ");
        String answer = "";
        int people = person * area;

        for (String s : article) {
            answer += Integer.parseInt(s) - people;
            answer += " ";
        }

        System.out.println(answer);
    }
}
