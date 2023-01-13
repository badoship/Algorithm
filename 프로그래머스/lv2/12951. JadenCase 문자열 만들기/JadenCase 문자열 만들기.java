class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        int idx = 0;
        for(char ch : s.toCharArray()){
            
            if(idx == 0 && Character.isLetter(ch)){
                ch = Character.toUpperCase(ch);
            }
            
            idx++;
            if( ch == ' ') idx = 0;
            answer += ch;
            
        }
        
        return answer;
    }
}