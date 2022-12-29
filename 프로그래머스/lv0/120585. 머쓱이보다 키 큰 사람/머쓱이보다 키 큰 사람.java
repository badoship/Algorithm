class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int val:array){
            if(height < val){
                answer ++;
            }
        }
        return answer;
    }
}