import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;
        if (n <= 1) {
            System.out.println(n);
            return;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }

//    public static int fibo(int n) {
//        if (n == 1 || n == 2) return 1;
//        else return fibo(n - 1) + fibo(n - 2);
//    }
}
