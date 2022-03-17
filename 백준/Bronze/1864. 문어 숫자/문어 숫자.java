import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.next();
            if (str.equals("#")) break;
            int answer = 0;
            int length = str.length() - 1;
            for (int i = 0; i < str.length(); i++) {
                String s = str.substring(i, i + 1);
                int num = -1;
                if (s.equals("-")) num = 0;
                else if (s.equals("\\")) num = 1;
                else if (s.equals("(")) num = 2;
                else if (s.equals("@")) num = 3;
                else if (s.equals("?")) num = 4;
                else if (s.equals(">")) num = 5;
                else if (s.equals("&")) num = 6;
                else if (s.equals("%")) num = 7;

                answer += Math.pow(8, length) * num;
                length--;
            }
            System.out.println(answer);
        }
    }
}
