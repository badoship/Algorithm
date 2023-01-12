class Solution {
    public long solution(long price, long money, long count) {
        long answer = count * (count+1) / 2 * price - money;
        return answer < 0 ? 0 : answer;
    }
}