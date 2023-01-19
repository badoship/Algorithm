import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        sc.close();
        int n = 1;
        while ( s >= 0 ){
            s -= n++;
        }
        System.out.println(n-2);
    }
}