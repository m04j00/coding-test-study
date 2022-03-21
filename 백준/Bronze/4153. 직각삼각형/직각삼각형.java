import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int[] triangle = new int[3];
            for (int i = 0; i < 3; i++) {
                triangle[i] = scanner.nextInt();
            }
            if (triangle[0] + triangle[1] + triangle[2] == 0) break;
            Arrays.sort(triangle);

            if (Math.pow(triangle[2], 2) == Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2))
                System.out.println("right");
            else System.out.println("wrong");
        }
        
    }
}
