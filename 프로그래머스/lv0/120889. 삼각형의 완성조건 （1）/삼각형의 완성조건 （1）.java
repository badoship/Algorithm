import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        return Arrays.stream(sides).sum() > Arrays.stream(sides).max().getAsInt() * 2 ?1 : 2;
    }
}