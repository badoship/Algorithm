import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        if ( arr.length == 1 ) return new int[]{-1};
        int minVal = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(val->val != minVal).toArray();
    }
}