class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char cha : my_string.toCharArray()){
            if( Character.isLowerCase(cha) ){
                answer += Character.toUpperCase(cha);
            }
            else {
                answer += Character.toLowerCase(cha);
            }
        }
        return answer;
    }
}