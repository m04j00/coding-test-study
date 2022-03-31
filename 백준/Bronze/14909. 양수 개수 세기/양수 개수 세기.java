import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int cnt = 0;
        for (String s : arr) {
            int k = Integer.parseInt(s);
            if (k > 0) cnt++;
        }
        System.out.println(cnt);
    }
}
