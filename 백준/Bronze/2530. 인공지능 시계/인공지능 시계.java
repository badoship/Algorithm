import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int ss = c + d % 60;
        int mi = b + d / 60 + ss / 60;
        int hh = a + mi / 60;
        mi %= 60;
        ss %= 60;
        hh %= 24;
        System.out.println(hh + " " + mi + " " + ss);
        
        sc.close();
    }
}