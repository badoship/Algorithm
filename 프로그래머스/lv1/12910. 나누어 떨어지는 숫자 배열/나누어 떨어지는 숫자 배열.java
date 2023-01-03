import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public ArrayList solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            if ( i % divisor == 0 ){
                list.add(i);
            }
        }
        
        list.sort(Comparator.naturalOrder());
        
        if (list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
}