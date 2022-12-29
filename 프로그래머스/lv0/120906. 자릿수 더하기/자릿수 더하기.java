class Solution {
    public int solution(int n) {
        int answer = 0;
        int len_n = Integer.toString(n).length();
        for(int i = len_n-1; i>=0; i--){
            answer +=  n / (int)Math.pow(10,i);
            n %= (int)Math.pow(10,i);
        }
        
        return answer;
    }
}