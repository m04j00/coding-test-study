package sliver.s4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no2164 {
    public static void main(String[] args) {
        Queue<Integer> card = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            card.add(i);
        }
        while (card.size() != 1) {
            card.poll();
            card.offer(card.poll());
        }
        System.out.println(card.poll());
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        ArrayList<Integer> card = new ArrayList<>();
//        for (int i = 1; i <= num; i++) {
//            card.add(i);
//        }
//        while (true) {
//            card.remove(0);
//            if (card.size() == 1) break;
//            card.add(card.get(0));
//            card.remove(0);
//
//        }
//        System.out.println(card.get(0));
//    }