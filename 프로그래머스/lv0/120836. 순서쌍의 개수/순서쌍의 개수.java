class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<(int)Math.sqrt(n-1)+1;i++){
            if(n % i == 0){
                answer ++;
            }
        }
        return answer * 2 + ( Math.sqrt(n) % 1 == 0 ? 1 : 0 );
    }
}