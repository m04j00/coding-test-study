import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int day = (100 - progresses[0]) / speeds[0];
        if((100 - progresses[0]) % speeds[0] != 0) day++;
        int cnt = 0;
        for(int i = 1; i < progresses.length; i++){
            int k = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0) k++;
            
            if(k > day) {
                list.add(++cnt);
                cnt = 0;
                day = k;
            }
            else{
                 cnt++;
            }
        }
        list.add(++cnt);
        int[] answer = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}