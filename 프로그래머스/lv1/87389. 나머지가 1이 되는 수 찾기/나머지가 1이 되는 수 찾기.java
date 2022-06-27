class Solution {
    public int solution(int n) {
        int k = n - 1;
        int answer = 0;
        while(k != 0){
            if(n % k == 1) answer = k;
            k--;
        }
        return answer;
    }
}