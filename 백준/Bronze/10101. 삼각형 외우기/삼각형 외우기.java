import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        String answer = "";

        if (a + b + c != 180) {
            System.out.println("Error");
            return;
        }
        
        if (a == b) {
            if (b == c) answer = "Equilateral";
            else answer = "Isosceles";
        } else if (b == c || a == c) {
            answer = "Isosceles";
        } else {
            answer = "Scalene";
        }

        System.out.println(answer);
    }
}
