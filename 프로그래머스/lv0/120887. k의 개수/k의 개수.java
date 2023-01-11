class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int temp;
        for(int num = i; num < j+1; num++){
            temp = num;
            while ( temp != 0 ){
                if ( temp % 10 == k ) answer ++;
                temp /= 10;
            }
        }
        return answer;
    }
}