import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minQ = new PriorityQueue<>(); // 가장 작은 수가 peek
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder()); // 가장 큰 수가 peek
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(br.readLine());

            // max와 min의 사이즈가 같으면 max에 저장
            if (maxQ.size() == minQ.size()) {
                maxQ.add(a);
            } else {
                minQ.add(a);
            }
            // min이 비어있지 않고 max의 가장 큰 요소가 min의 가장 작은 요소보다 크면 교환
            if (!minQ.isEmpty() && maxQ.peek() > minQ.peek()) {
                minQ.add(maxQ.poll()); // min에 max의 peek를 저장
                maxQ.add(minQ.poll()); // max에 min의 peek을 저장
            }
            sb.append(maxQ.peek()).append("\n");

        }
        System.out.println(sb);
    }
}
