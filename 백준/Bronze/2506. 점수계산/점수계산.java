import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int answer = 0;
        int cnt = 1;
        
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            if (k == 1) {
                answer += cnt;
                cnt++;
            } else cnt = 1;
        }
        
        System.out.println(answer);
    }
}
