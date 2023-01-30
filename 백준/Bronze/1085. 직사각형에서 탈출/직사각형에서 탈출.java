import java.util.Scanner;
import static java.lang.Math.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(min(min(x,w-x), min(y,h-y)));
    }
}