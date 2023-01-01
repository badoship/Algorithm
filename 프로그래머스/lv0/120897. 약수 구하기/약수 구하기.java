import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = getDivisors(n);
        list.sort(Comparator.naturalOrder());
        return list.stream().mapToInt(i->i).toArray();
    }
    
    public static ArrayList getDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<(int)Math.sqrt(n)+1;i++){
            if(n % i == 0){
                list.add(i);
                if(Math.pow(i,2) != n){
                    list.add(n/i);    
                }
            }
        }
        return list;
    }
}