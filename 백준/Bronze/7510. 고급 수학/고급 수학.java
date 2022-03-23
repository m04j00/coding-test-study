import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr = new int[3];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            arr[2] = scanner.nextInt();
            Arrays.sort(arr);
            System.out.println("Scenario #" + i + ":");
            if (Math.pow(arr[2], 2) == Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            System.out.println();
        }
    }
}
