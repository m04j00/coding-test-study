package bronze.b5;

import java.util.Scanner;

// 킹, 퀸, 룩, 비숍, 나이트, 폰
// https://www.acmicpc.net/problem/3003

public class no3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] havePiece = scan.nextLine().split(" ");
        int[] piece = {1, 1, 2, 2, 2, 8};
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < havePiece.length; i++) {
            answer.append(piece[i] - Integer.parseInt(havePiece[i])).append(" ");
        }

        System.out.println(answer);
    }
}
