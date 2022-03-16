import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            people -= scanner.nextInt();
            people += scanner.nextInt();
            if (max < people) max = people;
        }

        System.out.println(max);
    }
}
