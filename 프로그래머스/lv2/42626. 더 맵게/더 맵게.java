import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : scoville){
            queue.add(i);
        }
        while(queue.peek() <= K){
            if(queue.size() == 1) return -1;
            int a = queue.poll();
            int b = queue.poll();
            int scale = a + b * 2;
            answer++;
            queue.add(scale);
        }
        return answer;
    }
}