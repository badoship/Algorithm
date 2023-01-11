import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 100;
        int minVal = 100;
        Arrays.sort(array);
        for(int num : array){
            if( Math.abs(n - num) < minVal ){
                minVal = Math.abs(n - num);
                answer = num;
            }
        }
        return answer;
    }
}