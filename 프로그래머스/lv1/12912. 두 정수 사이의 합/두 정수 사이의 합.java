class Solution {
    public long solution(long a, long b) {
        if( b < a ){
            long c = a;
            a = b;
            b = c;
        }
        return (a+b)*(b-a+1)/2;
    }
}