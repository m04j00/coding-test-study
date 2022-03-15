import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder x = new StringBuilder(scanner.next()).reverse();
        StringBuilder y = new StringBuilder(scanner.next()).reverse();

        int numX = Integer.parseInt(removeZero(x));
        int numY = Integer.parseInt(removeZero(y));
        String sum = Integer.toString(numX + numY);

        StringBuilder answer = new StringBuilder(sum).reverse();

        String ret = removeZero(answer);
        System.out.println(ret);
    }

    public static String removeZero(StringBuilder str) {
        if (str.length() == 1) return str.toString();

        while (true) {
            if (str.substring(0, 1).equals("0")) str = new StringBuilder(str.substring(1));
            else break;
        }
        return str.toString();
    }
}
