class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(String s : my_string.split("")){
            if(answer.indexOf(s) == -1){
                answer += s;
            }
        }
        return answer;
    }
}