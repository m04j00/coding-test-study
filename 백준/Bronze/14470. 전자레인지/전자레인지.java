import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] input = new int[5];
        for (int i = 0; i < 5; i++) {
            input[i] = scanner.nextInt();
        }

        int answer = 0;
        while (input[0] != input[1]) {
            if (input[0] < 0) {
                answer += -input[0] * input[2];
                answer += input[3];
                input[0] = 0;
            } else {
                answer += input[4] * (input[1] - input[0]);
                input[0] = input[1];
            }
        }
        
        System.out.println(answer);
    }
}
