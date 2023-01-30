import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = 1 , b = 1;
        for(int i = k+1; i < n+1; i++){
            a *= i;
        }

        for(int i = 2; i < n-k+1; i++){
            b *= i;
        }

        System.out.println(a/b);
    }
}