class Solution {
    public int solution(int num, int k) {
        int idx = -1;
        int count = 0;
        while ( num > 0 ){
            if( num % 10 == k ){
                idx = Math.max(count,idx);
            }
            num /= 10;
            count ++;
        }
        return idx == -1 ? idx : count-idx;
    }
}