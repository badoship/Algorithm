import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        List<Long> list = digitToArray(n);
        list.sort(Comparator.naturalOrder());
        return arrayToDigit(list);
    }
    
    public static List digitToArray(long n){
        List<Long> list = new ArrayList<>();
        while(n > 0 ){
            list.add(n%10);
            n /= 10;
        }
        return list;
    }
    
    public static long arrayToDigit(List<Long> list){
        long val = 0;
        for(int i=0; i<list.size();i++){
            val += Math.pow(10,(i)) * list.get(i);
        }
        return val;
    }
}