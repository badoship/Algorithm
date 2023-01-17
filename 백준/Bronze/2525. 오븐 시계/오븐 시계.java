import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = b + c % 60;
        int hour = (a + c / 60 + min / 60) % 24;
        min = min % 60;
        
        System.out.println( hour + " " + min );
    }
}