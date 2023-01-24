import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int r;
        int e;
        int c;
        String answer;
        for(int i = 0; i < n; i++){
            r = sc.nextInt();
            e = sc.nextInt();
            c = sc.nextInt();
            if( e - c > r ){
                answer = "advertise";
            }
            else if( e - c < r ){
                answer = "do not advertise";
            }
            else{
                answer = "does not matter";
            }
            
            System.out.println(answer);
        }
    }
}