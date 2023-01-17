import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++){
            marsCalc(sc.nextLine());
        }
        
        sc.close();
    }
    
    static void marsCalc(String str){
        String[] strArr = str.split(" ");
        float calc = Float.parseFloat(strArr[0]);
        for(int i = 1; i < strArr.length; i++ ){
            String temp = strArr[i];
            if ( temp.equals("@") ){
                calc *= 3;
                continue;
            }
            
            if ( temp.equals("%") ){
                calc += 5;
                continue;
            }
            
            if ( temp.equals("#") ){
                calc -= 7;
            }
        }
        System.out.println(String.format("%.2f",calc));
    }
}