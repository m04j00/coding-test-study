import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sub1 = new int[4];
        int[] sub2 = new int[2];

        for (int i = 0; i < sub1.length; i++) {
            sub1[i] = scanner.nextInt();
        }
        for (int i = 0; i < sub2.length; i++) {
            sub2[i] = scanner.nextInt();
        }

        Arrays.sort(sub1);
        Arrays.sort(sub2);

        int most = sub1[1] + sub1[2] + sub1[3] + sub2[1];
        System.out.println(most);
    }
}
