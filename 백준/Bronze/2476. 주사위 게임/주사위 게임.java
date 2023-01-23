import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a;
        int b;
        int c;
        int price = 0;
        int tempPrice = 0;
        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            
            if ( a == b && b == c ){
                tempPrice = 10000 + a * 1000;
            }
            else if( a == b || a == c ){
                tempPrice = 1000 + a * 100;
            }
            else if( a == c ){
                tempPrice = 1000 + a * 100;
            }
            else if( b == c ){
                tempPrice = 1000 + b * 100;
            }
            else{
                tempPrice = Math.max( a , Math.max(b,c) ) * 100;
            }
            
            if ( price < tempPrice ){
                price = tempPrice;
            }
        }
        
        sc.close();
        
        System.out.println(price);
    }
}