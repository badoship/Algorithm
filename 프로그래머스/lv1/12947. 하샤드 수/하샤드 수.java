class Solution {
    public boolean solution(int x) {
        return x % getPositionSum(x) == 0 ? true : false;
    }
    
    public static int getPositionSum(int x){
        int pSum = 0;
        while(x > 0){
            pSum += x % 10;
            x /= 10;
        }
        return pSum;        
    }
}