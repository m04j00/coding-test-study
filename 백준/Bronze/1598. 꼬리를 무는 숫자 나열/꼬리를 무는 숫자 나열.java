import java.util.Scanner;

//https://www.acmicpc.net/problem/1598
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt() - 1;
        int b = scanner.nextInt() - 1;

        int answer = 0;

        answer += Math.abs(a / 4 - b / 4);
        answer += Math.abs(a % 4 - b % 4);

        System.out.println(answer);
    }
}
