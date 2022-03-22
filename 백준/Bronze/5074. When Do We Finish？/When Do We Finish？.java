import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.next();
            String c = scanner.next();
            if (s.equals("00:00") && c.equals("00:00")) break;

            String[] start = s.split(":");
            String[] continueT = c.split(":");

            int m = Integer.parseInt(start[1]) + Integer.parseInt(continueT[1]);
            int h = Integer.parseInt(start[0]) + Integer.parseInt(continueT[0]);
            int add = 0;
            if (m / 60 > 0) {
                h += m / 60;
                m %= 60;
            }
            if (h / 24 > 0) {
                add = h / 24;
                h %= 24;
            }
            StringBuilder print = new StringBuilder();
            if (h < 10) print = new StringBuilder("0" + h + ":");
            else print = new StringBuilder(h + ":");

            if (m < 10) print.append("0").append(m);
            else print.append(m);
            System.out.print(print);
            if (add > 0) System.out.println(" +" + add);
            else System.out.println();

        }
    }
}
