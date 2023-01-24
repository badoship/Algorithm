import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cute = 0;
        for(int i = 0; i < n; i++){
            if( sc.nextInt() == 1 ){
                cute++;
            }
        }
        String answer;
        if( cute * 2 < n ){
            answer = "Junhee is not cute!";
        }
        else{
            answer = "Junhee is cute!";
        }
        
        System.out.println(answer);
    }
}