class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isFirst = true;
        for(String st : s.toLowerCase().split("")){
            answer += isFirst ? st.toUpperCase() : st;
            isFirst = st.equals(" ")?true:false;
        }
        
        return answer;
    }
}