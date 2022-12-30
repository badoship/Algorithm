import java.util.HashMap;

class Solution {
    
    String getWinArray(String rsp){
        String answer = "";
        HashMap<String,String> hash = new HashMap<>();
        hash.put("0","5");
        hash.put("2","0");
        hash.put("5","2");
        
        for(char ch : rsp.toCharArray()){
            answer += hash.get(""+ch);
        }
        
        return answer;
    }
    
    public String solution(String rsp) {
        return getWinArray(rsp);
    }
}