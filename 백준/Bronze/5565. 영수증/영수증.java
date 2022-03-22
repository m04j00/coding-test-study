import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = scanner.nextInt();
        int sumPrice = 0;
        for (int i = 1; i < 10; i++) {
            sumPrice += scanner.nextInt();
        }
        int price = totalPrice - sumPrice;
        System.out.println(price);
    }
}
