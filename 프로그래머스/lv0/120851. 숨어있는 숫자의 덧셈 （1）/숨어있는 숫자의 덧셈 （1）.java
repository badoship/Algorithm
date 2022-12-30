class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(String val : my_string.replaceAll("[^0-9]","").split("")){
            answer += Integer.parseInt(val);
        }
        return answer;
    }
}