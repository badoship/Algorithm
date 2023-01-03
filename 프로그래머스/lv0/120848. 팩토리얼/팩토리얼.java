class Solution {
    public int solution(int n) {
        int answer = 1;
        int idx = 1;
        while(true){
            answer *= idx;
            if( answer > n ) return idx-1;
            idx++;
        }
    }
}