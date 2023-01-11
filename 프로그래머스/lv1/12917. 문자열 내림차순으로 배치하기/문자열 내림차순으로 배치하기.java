import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split("");
        Arrays.sort(strArr,Collections.reverseOrder());
        return String.join("",strArr);
    }
}