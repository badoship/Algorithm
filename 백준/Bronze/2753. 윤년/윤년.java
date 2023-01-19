import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        String answer = "0";
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        
        if( year % 400 == 0 ){
            answer = "1";
        }
        else if( year % 4 == 0 && year % 100 != 0 ){
            answer = "1";
        }
        
        System.out.println(answer);
    }
}