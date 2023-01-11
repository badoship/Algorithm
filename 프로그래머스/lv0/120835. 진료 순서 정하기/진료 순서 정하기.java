class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int temp;
        int idx = 0;
        for(int num1 : emergency){
            temp = 1;
            for(int num2 : emergency){
                if(num1 < num2){
                    temp ++;
                }
            }
            answer[idx] = temp;
            idx ++;
        }
        return answer;
    }
}