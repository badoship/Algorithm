import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int max_val = 0;
        int max_idx = 0;
        
        for(int i=0; i<array.length; i++){
            if(max_val < array[i]){
                max_val = array[i];
                max_idx = i;
            }
        }
        return new int[]{max_val,max_idx};
    }
}