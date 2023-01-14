
import java.util.Arrays;
class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        for(String st : dic){
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            if(String.join("",(spell)).equals(new String(ch))){
                return 1;
            }
        }
        return 2;
    }
}