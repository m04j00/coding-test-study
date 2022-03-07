package bronze.b4;

import java.util.Arrays;
import java.util.Scanner;

public class no5596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] score = new int[2][4];
        int[] addScore = new int[2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                score[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                addScore[i] += score[i][j];
            }
        }
        Arrays.sort(addScore);
        System.out.println(addScore[1]);
    }
}
