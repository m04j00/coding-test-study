import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String firstOp = "";
        String lastOp = "";

        if (a + b == c) firstOp = "+";
        else if (a - b == c) firstOp = "-";
        else if (a * b == c) firstOp = "*";
        else if (a / b == c) firstOp = "/";
        if (!firstOp.equals("")) {
            lastOp = "=";
            System.out.println(a + firstOp + b + lastOp + c);
        } else {
            firstOp = "=";
            if (a == b + c) lastOp = "+";
            else if (a == b - c) lastOp = "-";
            else if (a == b * c) lastOp = "*";
            else if (a == b / c) lastOp = "/";
            System.out.println(a + firstOp + b + lastOp + c);
        }
    }
}
