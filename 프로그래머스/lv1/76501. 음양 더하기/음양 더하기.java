class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int idx = 0;
        for(int absolute : absolutes){
            answer += signs[idx++] ? absolute : -absolute;
        }
        return answer;
    }
}