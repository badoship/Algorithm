import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            
            System.out.println(a*b / gcd(a,b));
        }
    }
    
    static int gcd(int a,int b){
        int temp;
        if( a < b ){
            temp = a;
            a = b;
            b = temp;
        }
        
        while( b != 0 ){
            temp = a%b;
            a = b;
            b = temp;
        }
        
        return a;
    }
}