import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();
        int[] output = {0, 0, 0};

        output[0] = input / 300;
        input %= 300;
        output[1] = input / 60;
        input %= 60;
        output[2] = input / 10;
        input %= 10;

        if (input > 0) System.out.println(-1);
        else {
            for (int i : output) {
                System.out.print(i + " ");
            }
        }
        
    }
}
