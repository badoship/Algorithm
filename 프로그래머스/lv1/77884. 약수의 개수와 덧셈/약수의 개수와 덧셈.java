class Solution {
    public int solution(int left, int right) {
        int answer = right*(right+1)/2 - left*(left-1)/2;
        for(int i=left; i<right+1; i++){
            if(Math.sqrt(i)%1==0){
                answer -= i*2;
            } 
        }
        return answer;
    }
}