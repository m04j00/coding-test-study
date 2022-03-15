import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> card = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            card.add(i);
        }
        while(card.size() != 1){
            card.poll();
            card.offer(card.poll());
        }
        System.out.println(card.poll());
    }
}
