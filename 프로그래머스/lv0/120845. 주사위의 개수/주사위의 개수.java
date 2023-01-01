class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for (int val : box){
            answer *= val / n;
        }
        return answer;
    }
}