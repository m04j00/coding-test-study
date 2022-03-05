package bronze.b2;

import java.util.Scanner;

public class no2920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String answer = "";

        if (s.equals("1 2 3 4 5 6 7 8")) answer = "ascending";
        else if (s.equals("8 7 6 5 4 3 2 1")) answer = "descending";
        else answer = "mixed";

        System.out.println(answer);
    }
}
