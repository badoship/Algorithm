class Solution {
    public int[][] solution(int[] num_list, int n) {
        int lenList = num_list.length;
        int[][] answer = new int[num_list.length/n][n];
        for(int i=0; i < lenList; i++){
                answer[i/n][i%n] = num_list[i];
        }
        return answer;
    }
}