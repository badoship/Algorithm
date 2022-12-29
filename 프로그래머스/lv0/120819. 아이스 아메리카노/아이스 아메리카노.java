class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int americano_price = 5500;
        answer[0] = money / americano_price;
        answer[1] = money % americano_price;
        return answer;
    }
}