import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int p1 = 0;
            int p2 = 0;
            for (int j = 0; j < n; j++) {
                String p1h = scanner.next();
                String p2h = scanner.next();
                if (rps(p1h, p2h)) p1++;
                else if (rps(p2h, p1h)) p2++;
            }
            if (p1 > p2) System.out.println("Player 1");
            else if (p1 < p2) System.out.println("Player 2");
            else System.out.println("TIE");
        }
    }

    public static boolean rps(String a, String b) {
        if (a.equals("R") && b.equals("S")) return true;
        else if (a.equals("S") && b.equals("P")) return true;
        else if (a.equals("P") && b.equals("R")) return true;
        return false;
    }
}
