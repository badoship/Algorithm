class Solution {
    public int solution(int hp) {
        int ant5 = hp / 5;
        int ant3 = ( hp - 5 * ant5 ) / 3;
        int ant1 = hp - ant5 * 5 - ant3 * 3;
        return ant5 + ant3 + ant1;
    }
}