class Solution {
    boolean solution(String s) {
        return stringFindCharCount('p',s) == stringFindCharCount('y',s) ? true : false;
    }
    
    static int stringFindCharCount(char c , String s){
        return s.toLowerCase().replaceAll("[^"+c+"]","").length();
    }
}