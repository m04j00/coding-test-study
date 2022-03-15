import java.util.Scanner;

// 2진수 8진수
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder binary = new StringBuilder(scanner.next());
        int length = binary.length();
        StringBuilder answer = new StringBuilder();

        if (length % 3 == 1) binary.insert(0, "00");
        else if (length % 3 == 2) binary.insert(0, "0");

        int i;
        for (i = 0; i < length; i += 3) {
            answer.append(binaryToOctal(binary.substring(i, i + 3)));
        }
        
        System.out.println(answer);
    }

    public static String binaryToOctal(String b) {
        int sum = 0;
        int i = 1;

        int a = Integer.parseInt(b);
        while (a > 0) {
            sum += i * (a % 10); // 1의 자리 수와 i 곱하여 더함
            i = i * 2; // 2진수이기에 i에 2를 곱해줌
            a /= 10; // 1의 자리 수 자르기
        }
        return Integer.toString(sum);
    }
}
