package bronze.b4;

import java.util.Scanner;

public class no5575 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] timeCard = new int[3][6];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 6; j++){
                timeCard[i][j] = scanner.nextInt();
            }
        }

        int[][] time = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 2; j >= 0; j--){
                if(timeCard[i][j+3] < timeCard[i][j]){
                    int startS = 60 - timeCard[i][j];
                    time[i][j] = timeCard[i][j+3] + startS;
                    timeCard[i][j+2]--;

                }
                else{
                    time[i][j] = timeCard[i][j+3] - timeCard[i][j];
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(time[i][j] + " ");
            }
            System.out.println();
        }

    }
}
