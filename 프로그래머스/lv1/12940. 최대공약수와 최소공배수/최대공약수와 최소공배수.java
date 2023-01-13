class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n,m);
        answer[0] = gcd;
        answer[1] = n * m / gcd; 
        return answer;
    }
    
    public int gcd(int n, int m){
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
        return n;
    }
}