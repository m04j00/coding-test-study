import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(Math.min(a[0] + a[3], a[1] + a[2]));

    }
}
