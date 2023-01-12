class Solution {
    public long solution(String my_string) {
        return getStringToInt(my_string);
    }
    
    public long getStringToInt(String str){
        long answer = 0;
        String temp = "";
        for(char ch : str.toCharArray()){
            if ( Character.isDigit(ch) ){
                temp += String.valueOf(ch);
            }
            else{
                if(!temp.isEmpty()){
                    answer += Long.parseLong(temp);
                    temp = "";
                }
            }
        }
        if(!temp.isEmpty()){
            answer += Long.parseLong(temp);
            temp = "";
        }
        return answer;
    }
    
}