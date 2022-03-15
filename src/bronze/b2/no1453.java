package bronze.b2;

import java.util.ArrayList;
import java.util.Scanner;

//피시방 알바
//https://www.acmicpc.net/problem/1453
public class no1453 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int cnt = 0;
        ArrayList<Integer> seats = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int seat = scanner.nextInt();
            if (seats.contains(seat)) {
                cnt++;
            } else {
                seats.add(seat);
            }
        }
        System.out.println(cnt);
    }
}
