package bronze.b5;

import java.util.Scanner;

public class no5554 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0, y = 0;

        for(int i = 0; i < 4; i++){
            y += scan.nextInt();
            if(y >= 60){
                do {
                    y -= 60;
                    x++;
                } while (y >= 60);
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}
