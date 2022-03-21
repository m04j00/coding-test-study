import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] now = scanner.next().split(":");
        String[] throwNa = scanner.next().split(":");

        String[] wait = new String[3];
        for (int i = 2; i > 0; i--) {
            if (Integer.parseInt(now[i]) > Integer.parseInt(throwNa[i])) {
                int t = 60 - Integer.parseInt(now[i]);
                wait[i] = Integer.toString(t + Integer.parseInt(throwNa[i]));
                throwNa[i - 1] = Integer.toString(Integer.parseInt(throwNa[i - 1]) - 1);
            } else {
                wait[i] = Integer.toString(Integer.parseInt(throwNa[i]) - Integer.parseInt(now[i]));
            }
        }
        if (Integer.parseInt(now[0]) > Integer.parseInt(throwNa[0])) {
            int t = 24 - Integer.parseInt(now[0]);
            wait[0] = Integer.toString(t + Integer.parseInt(throwNa[0]));
        } else {
            wait[0] = Integer.toString(Integer.parseInt(throwNa[0]) - Integer.parseInt(now[0]));
        }

        int zero = 0;
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(wait[i]) < 10) {
                wait[i] = "0" + wait[i];
            }
            if (wait[i].equals("00")) zero++;
        }
        if (zero == 3) System.out.println("24:00:00");
        else System.out.println(wait[0] + ":" + wait[1] + ":" + wait[2]);
    }
}
