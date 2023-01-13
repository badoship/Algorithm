class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[1] = n * m;
        int temp;
        if( n < m ){
            temp = n;
            n = m;
            m = temp;
        }
        while (m > 0){
            temp = n % m;
            n = m;
            m = temp;
        }
        answer[0] = n;
        answer[1] /= n; 
        return answer;
    }
}