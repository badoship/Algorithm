import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        if ( arr.length == 1 ) return new int[]{-1};
        int[] answer = new int[arr.length-1];
        int idx = 0;
        int minVal = Arrays.stream(arr).min().getAsInt();
        for(int i : arr){
            if(minVal != i){
                answer[idx++] = i;
            }
        }
        return answer;
    }
}