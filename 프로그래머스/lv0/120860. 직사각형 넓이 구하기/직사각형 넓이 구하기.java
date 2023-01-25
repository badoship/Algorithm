class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX = -256;
        int minX = 256;
        int maxY = -256;
        int minY = 256;
        
        for(int[] dot : dots){
            if( maxX < dot[0] ){
                maxX = dot[0];
            }
            else if( minX > dot[0] ){
                minX = dot[0];
            }
            
            if( maxY < dot[1] ){
                maxY = dot[1];
            }
            else if( minY > dot[1] ){
                minY = dot[1];
            } 
        }
        
        return (maxX-minX) * (maxY-minY);
    }
}