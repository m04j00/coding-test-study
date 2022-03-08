import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] date = new int[3];

        date[0] = scanner.nextInt();
        date[1] = scanner.nextInt();
        date[2] = scanner.nextInt();

        int date1 = (11 * 1440) + (11 * 60) + 11;
        int date2 = (date[0] * 1440) + (date[1] * 60) + date[2];

        int answer = date2 - date1;

        if (answer >= 0)
            System.out.println(answer);
        else System.out.println(-1);

    }
}
