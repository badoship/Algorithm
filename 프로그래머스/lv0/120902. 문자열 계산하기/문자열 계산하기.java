class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean isPlus = true;
        for(String str : my_string.split(" ")){
            
            if(str.chars().allMatch(Character::isDigit)){
                int num = Integer.valueOf(str);
                answer += isPlus ? num : -1 * num;
                continue;
            }
            
            isPlus = str.equals("+") ? true : false;
        }
        return answer;
    }
}