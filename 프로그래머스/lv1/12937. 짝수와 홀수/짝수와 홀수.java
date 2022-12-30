class Solution {
    
    String getOddOrEven(int n){
        return n % 2 == 0 ? "Even" : "Odd";
    }
    public String solution(int num) {
        return getOddOrEven(num);
    }
}