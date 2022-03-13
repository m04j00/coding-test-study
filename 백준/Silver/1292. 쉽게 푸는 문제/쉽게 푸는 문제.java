import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        int answer = 0;
        int k = 1; 
        int cnt = 1;
        boolean plug = false;
        
        while (true) {
            for (int i = 1; i <= k; i++) {
                if (start <= cnt) {
                    answer += k;
                }
                if (end == cnt) {
                    plug = true;
                    break;
                }
                cnt++;
            }
            if (plug) break;
            k++;
        }
        
        System.out.println(answer);
    }
}
