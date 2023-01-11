class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp;
        for(int num : array){
            temp = num;
            while( temp > 0 ){
                if( temp % 10 == 7) answer ++;
                temp /= 10;
            }
        }
        return answer;
    }
}