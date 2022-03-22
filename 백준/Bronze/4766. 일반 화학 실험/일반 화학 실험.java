import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double beforeTemp = scanner.nextDouble();
        if (beforeTemp == 999) return;
        while (true) {
            double temp = scanner.nextDouble();
            if (temp == 999) break;
            System.out.println(String.format("%.2f", temp - beforeTemp));
            beforeTemp = temp;

        }
    }
}
