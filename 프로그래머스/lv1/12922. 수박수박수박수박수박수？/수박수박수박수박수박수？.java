class Solution {
    public String solution(int n) {
        return "수박".repeat((n - 1) / 2) + (n % 2 == 0 ? "수박" : "수");
    }
}