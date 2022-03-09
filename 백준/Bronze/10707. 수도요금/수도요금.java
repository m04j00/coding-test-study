import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] input = new int[5];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        // input[0] : X사의 1리터당 요금
        // input[4] : JOI군의 한 달간 수도 양
        int x = input[0] * input[4];

        //input[1] : Y사의 기뵨요금
        int y = input[1];

        //input[2] : Y사의 기본요금이 되는 사용량 상한 리터
        // input[4] : JOI군의 한 달간 수도 양
        if (input[2] < input[4]) {
            int k = input[4] - input[2];
            // input[3] : Y사의 1리터 당 추가요금
            y += k * input[3];
        }

        System.out.println(Math.min(x, y));
    }
}
