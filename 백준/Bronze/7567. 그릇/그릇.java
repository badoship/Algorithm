import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String bowls = sc.nextLine();
        sc.close();
        int height = 10;
        for(int i = 1; i < bowls.length(); i++){
            if( bowls.charAt(i) == bowls.charAt(i-1) ){
                height += 5;
            }
            else {
                height += 10;
            }
        }
        System.out.println(height);
    }
}