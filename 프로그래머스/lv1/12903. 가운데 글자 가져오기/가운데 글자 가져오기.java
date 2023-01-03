class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        int sLen = s.length();
        return sLen % 2 == 1 ? sArr[sLen/2] : sArr[sLen/2-1] + sArr[sLen/2];
    }
}