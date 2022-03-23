import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.next();
            int book = scanner.nextInt();
            if (name.equals("#")) break;

            while (true) {
                String s = scanner.next();
                int n = scanner.nextInt();

                if (s.equals("B") && book + n <= 68) book += n;
                else if (s.equals("C") && book - n >= 0) book -= n;
                else if (s.equals("X")) break;
            }

            System.out.println(name + " " + book);
        }
    }
}
