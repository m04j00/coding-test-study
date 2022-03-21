import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int winner = 0;

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += scanner.nextInt();
            }
            if (max < sum) {
                max = sum;
                winner = i + 1;
            }
        }
        System.out.println(winner + " " + max);
    }
}
