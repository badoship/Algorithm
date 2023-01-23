import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String bowls = sc.nextLine();
        sc.close();
        String[] bowlsArr = bowls.split("");
        int height = 10;
        String bowl = bowlsArr[0];
        
        for(int i = 1; i < bowlsArr.length; i++){
            if ( bowlsArr[i].equals(bowl) ){
                height += 5;
            }
            else {
                height += 10;
            }
            bowl = bowlsArr[i];
        }
        
        System.out.println(height);
    }
}