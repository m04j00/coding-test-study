import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        boolean plug = true;
        for (int j = 0; j < 5; j++) {
            if (arr[0][j] == arr[1][j]) {
                plug = false;
                break;
            }
        }
        if (plug) System.out.println("Y");
        else System.out.println("N");
    }
}
