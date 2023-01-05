import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] beforeToCharArr = before.toCharArray();
        char[] afterToCharArr = after.toCharArray();
        Arrays.sort(beforeToCharArr);
        Arrays.sort(afterToCharArr);
        return new String(beforeToCharArr).equals(new String(afterToCharArr)) ? 1:0;
    }
}