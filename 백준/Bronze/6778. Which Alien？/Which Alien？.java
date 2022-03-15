import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int antenna = scanner.nextInt();
        int eyes = scanner.nextInt();

        if (antenna > 2 && eyes < 5) output("TroyMartian");
        if (antenna < 7 && eyes > 1) output("VladSaturnian");
        if (antenna < 3 && eyes < 4) output("GraemeMercurian");

    }

    public static void output(String message) {
        System.out.println(message);
    }
}
