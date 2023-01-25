import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        String answer;
        while (true){
            a = sc.nextInt();
            b = sc.nextInt();
            
            if( a == 0 && b == 0 ){
                break;
            }
            
            if( b % a == 0 ){
                answer = "factor";
            }
            else if( a % b == 0 ){
                answer = "multiple";
            }
            else{
                answer = "neither";
            }
            System.out.println(answer);
        }
    }
}