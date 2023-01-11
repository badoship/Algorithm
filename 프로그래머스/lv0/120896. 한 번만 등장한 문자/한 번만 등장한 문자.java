class Solution {
    public String solution(String s) {
        String answer = "";
        int[] nums = new int[26];
        int charA = (int)'a';
        for(char ch : s.toCharArray()){
            nums[ch-charA]++;
        }
        for(int i=0; i<nums.length; i++){
            if( nums[i] == 1 ){
                answer += String.valueOf((char)(i+charA));
            }
        }
        return answer;
    }
}