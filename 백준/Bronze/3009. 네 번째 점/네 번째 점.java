import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[3];
        int[] y = new int[3];
        
        for(int i = 0; i < 3; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        sc.close();
        
        int xx = x[0];
        int yy = y[0];
        
        if (x[0] == x[1]){
            xx = x[2];
        }
        else if (x[0] == x[2]){
            xx = x[1];
        }
        
        if (y[0] == y[1]){
            yy = y[2];
        }
        else if (y[0] == y[2]){
            yy = y[1];
        }
        
        System.out.println(xx + " " + yy);
    }
}