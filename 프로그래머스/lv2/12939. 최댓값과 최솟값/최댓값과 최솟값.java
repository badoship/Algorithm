import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] intArr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intArr);
        return intArr[0] + " " + intArr[intArr.length-1];
    }
}