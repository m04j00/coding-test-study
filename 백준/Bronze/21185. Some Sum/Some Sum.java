import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 4 == 0) System.out.println("Even");
        else if (n % 2 == 0) System.out.println("Odd");
        else System.out.println("Either");
    }
}
