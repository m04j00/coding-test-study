import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] card = new int[2][10];
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 10; i++) {
                card[j][i] = scanner.nextInt();
            }
        }

        int a = 0;
        int b = 0;
        char whoseWin = 'D';
        for (int i = 0; i < 10; i++) {
            if (card[0][i] > card[1][i]) {
                a += 3;
                whoseWin = 'A';
            } else if (card[0][i] < card[1][i]) {
                b += 3;
                whoseWin = 'B';
            } else {
                a++;
                b++;
            }
        }
        
        System.out.println(a + " " + b);
        if (a > b) System.out.println("A");
        else if (a < b) System.out.println("B");
        else if (a == 10 && b == 10) System.out.println("D");
        else System.out.println(whoseWin);
    }
}
