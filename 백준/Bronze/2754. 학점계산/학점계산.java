import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String score = scanner.next();

        if (score.equals("F")) {
            System.out.println(0.0);
            return;
        }

        double answer = 0.0;
        answer += 69 - score.charAt(0);

        switch (score.charAt(1)) {
            case '+':
                answer += 0.3;
                break;
            case '-':
                answer -= 0.3;
        }

        System.out.println(answer);
    }
}
