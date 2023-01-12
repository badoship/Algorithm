import java.util.ArrayList;
class Solution {
    public ArrayList solution(int n) {
        return getPrimes(n);
    }
    
    public ArrayList getPrimes(int n){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=2; i<n+1; i++){
            if( n % i == 0){
                answer.add(i);
                while(n % i == 0){
                    n /= i;
                }
            }
        }
        return answer;
    }
}