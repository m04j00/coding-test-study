package bronze.b4;

import java.util.Arrays;
import java.util.Scanner;

public class no2752 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] num = {a, b, c};

        Arrays.sort(num);
        System.out.println(num[0] + " " + num[1] + " " + num[2]);
    }
}
