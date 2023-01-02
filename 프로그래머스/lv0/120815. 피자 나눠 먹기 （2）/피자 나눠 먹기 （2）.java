class Solution {
    public int solution(int n) {
        int answer = 1;
        int piece = 6;
        while ( (piece * answer) % n != 0 ){
            answer ++;
        }
        return answer;
    }
}