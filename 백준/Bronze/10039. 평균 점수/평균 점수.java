import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] score = new int[5];

        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int s : score) {
            sum += Math.max(s, 40);
        }

        System.out.println(sum / score.length);
    }
}
