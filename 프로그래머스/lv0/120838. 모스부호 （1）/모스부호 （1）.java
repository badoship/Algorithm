import java.util.HashMap;
class Solution {
    public static HashMap<String,Character> makeHashMap(){
        String[] str = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String,Character> map = new HashMap<>();
        int charIdx = 97;
        for(String s : str){
            map.put(s,(char)charIdx++);
        }
        return map;
    }
    
    public String solution(String letter) {
        HashMap<String,Character> map = makeHashMap();
        String answer = "";
        for(String s : letter.split(" ")){
            answer += map.get(s);
        }
        return answer;
    }
}