import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        sc.nextLine();
        String votes = sc.nextLine();
        int a = 0;
        int b = 0;
        for(int i = 0; i < v; i++){
            if( votes.charAt(i) == 'A'){
                a++;
                continue;
            }
            b++;
        }
        System.out.println(a==b?"Tie":a>b?"A":"B");
    }
}