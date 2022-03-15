import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cnt = scanner.nextInt();
        int answer = 0;
        
        for (int i = 0; i < cnt; i++) {
            answer += scanner.nextInt();
            if (answer > 0 && i != cnt - 1) answer--;
        }
        
        System.out.println(answer);
    }
}
