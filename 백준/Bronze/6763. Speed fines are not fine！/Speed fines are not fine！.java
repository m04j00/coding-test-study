import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int limit = scanner.nextInt();
        int car = scanner.nextInt();

        if (limit - car < 0) {
            int radar = -(limit - car);
            int fine = 0;
            
            if (radar <= 20) fine = 100;
            else if (radar <= 30) fine = 270;
            else fine = 500;
           
            System.out.println("You are speeding and your fine is $" + fine + ".");
        } else {
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
