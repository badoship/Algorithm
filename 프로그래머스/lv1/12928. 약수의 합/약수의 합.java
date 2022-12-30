class Solution {
    int getDivisorsSum(int n){
        int result = 0;
        
        for(int i=1; i<(int)Math.sqrt(n-1)+1;i++){
            if ( n % i == 0 ){
                result += n / i + i;
            }
        }
        
        return result + (int)(Math.sqrt(n) % 1 == 0 ? Math.sqrt(n) : 0);
    }
    
    public int solution(int n) {
        return getDivisorsSum(n);
    }
}