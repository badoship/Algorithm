import java.util.Scanner;
import java.util.Arrays;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()};
        sc.close();
        Arrays.sort(intArr);
        System.out.println(intArr[1]);
        
        
    }
}