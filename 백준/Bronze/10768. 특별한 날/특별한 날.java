import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        if (m == 2 && d == 18) {
            System.out.println("Special");
            return;
        }
        
        if (m == 2 && d < 18) System.out.println("Before");
        else if (m < 2) System.out.println("Before");
        else System.out.println("After");
    }
}
