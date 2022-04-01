import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int k = scanner.nextInt();
            if (k == 0) break;
            String[] arr = new String[k];
            String[] answer = new String[k];
            for (int i = 0; i < k; i++) {
                answer[i] = scanner.next();
                arr[i] = answer[i].toLowerCase();
            }
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                if (arr[0].equals(answer[i].toLowerCase())) {
                    System.out.println(answer[i]);
                    break;
                }
            }
        }
    }
}
