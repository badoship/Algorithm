class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        String[] answer = new String[(len-1)/n+1];
        String temp = "";
        int idx = 0;
        for(int i=0; i < len; i++){
            temp += my_str.charAt(i);
            if ((i+1) % n == 0 || i == len-1){
                answer[idx++] = temp;
                temp = "";
            }
        }
        return answer;
    }
}