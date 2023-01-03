class Solution {
    public String solution(String phone_number) {
        int startIdx = phone_number.length()-4;
        return "*".repeat(startIdx) + phone_number.substring(startIdx);
    }
}