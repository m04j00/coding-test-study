import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int[] tri = new int[3];
            tri[0] = scanner.nextInt();
            tri[1] = scanner.nextInt();
            tri[2] = scanner.nextInt();

            if (tri[2] == 0) break;
            
            Arrays.sort(tri);
            
            if (tri[2] >= tri[0] + tri[1]) {
                System.out.println("Invalid");
            } else if (tri[0] == tri[1] && tri[1] == tri[2]) {
                System.out.println("Equilateral");
            } else if (tri[0] == tri[1] || tri[0] == tri[2] || tri[1] == tri[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
            
        }

    }
}
