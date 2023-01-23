import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int hh = sc.nextInt();
        int mi = sc.nextInt();
        sc.close();
        
        mi -= 45;
        
        if ( mi < 0 ){
            hh -= 1;
            mi += 60;
            
            if ( hh < 0 ){
                hh += 24;
            }
        }
        
        System.out.println(hh + " " + mi);
        
    }
}