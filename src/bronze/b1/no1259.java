package bronze.b1;

import java.util.Scanner;

public class no1259 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String[] s = scan.next().split("");
            if (s[0].equals("0")) break;
            int j = s.length - 1;
            boolean plug = true;
            for (int i = 0; i < s.length / 2; i++) {
                if (!s[i].equals(s[j])) {
                    plug = false;
                    break;
                }
                j--;

            }
            if (plug)
                System.out.println("yes");
            else System.out.println("no");
        }
    }
}
