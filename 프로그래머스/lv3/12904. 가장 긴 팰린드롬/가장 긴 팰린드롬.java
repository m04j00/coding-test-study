class Solution
{
    public int solution(String s)
    {
        char[] arr = s.toCharArray();
        for(int i = s.length(); i > 1; i--){
            for(int j = 0; j + i <= s.length(); j++){
                boolean check = true;
                for(int k = 0; k < i / 2; k++){
                    if(arr[j + k] != arr[j + i - k - 1]){
                        check = false; 
                        break;
                    }
                }
                if(check) return i;
            }
        }
        return 1;
    }
}