import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String score = sc.nextLine();
        sc.close();
        char ch = score.charAt(0);
        double point = 0.0;
        switch( ch ){
            case 'A' :
                point = 4;
                break;
            case 'B' :
                point = 3;
                break;
            case 'C' :
                point = 2;
                break;
            case 'D' :
                point = 1;
                break;
            default :
                System.out.println(point);
                return;
        }
        
        ch = score.charAt(1);
        
        if ( ch == '+' ){
            point += 0.3;
        }
        else if ( ch == '-'){
            point -= 0.3;
        }
        
        System.out.println(point);
        
    }
}