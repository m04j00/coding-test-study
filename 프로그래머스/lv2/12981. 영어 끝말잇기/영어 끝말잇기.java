import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> map = new HashSet<>();
        map.add(words[0]);

        for(int i = 1; i < words.length; i++){
            if(
                words[i-1].substring(words[i-1].length() - 1).equals(
                    words[i].substring(0, 1))
              && !map.contains(words[i])
            ) {
                map.add(words[i]);
            }
            else{
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }

        return answer;
    }
}