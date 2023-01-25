class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        for(String str : keyinput){
            if( str.equals("up") && y < board[1] / 2 ){
                y++;
            }
            else if( str.equals("down") && y > (board[1] / 2) * -1 ){
                y--;
            }
            else if( str.equals("left") && x > (board[0] / 2) * -1 ){
                x--;
            }
            else if( str.equals("right") && x < board[0] / 2 ){
                x++;
            }
        }
        return new int[]{x,y};
    }
}