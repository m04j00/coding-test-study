import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String n = scanner.next();
            if (n.equals("0")) break;
            int answer = 0;
            while (true) {
                if (n.length() != 1) {
                    answer = root(n);
                } else answer = Integer.parseInt(n);
                if (answer < 10) break;
                else {
                    n = Integer.toString(answer);
                    answer = 0;
                }
            }
            System.out.println(answer);

        }
    }

    public static int root(String n) {
        int answer = 0;
        String[] arr = n.split("");
        for (String s : arr) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}