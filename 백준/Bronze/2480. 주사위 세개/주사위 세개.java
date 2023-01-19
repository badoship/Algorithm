import java.util.Scanner;
import java.util.Arrays;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()};
        Arrays.sort(intArr);
        
        if(intArr[0] == intArr[1] && intArr[1] == intArr[2]){
            System.out.println(10000 + intArr[0] * 1000);
        }
        else if(intArr[0] == intArr[1]){
            System.out.println(1000 + intArr[0] * 100);
        }
        else if(intArr[0] == intArr[2]){
            System.out.println(1000 + intArr[0] * 100);
        }
        else if(intArr[1] == intArr[2]){
            System.out.println(1000 + intArr[1] * 100);
        }
        else{
            System.out.println(Math.max(intArr[0],Math.max(intArr[1],intArr[2])) * 100);
        }
    }
}