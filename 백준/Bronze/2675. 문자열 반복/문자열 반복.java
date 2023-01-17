import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String str;
        for(int i = 0; i < t; i++){
            stringMultiple(sc.nextLine());
        }
        
        sc.close();
    }
    
    static void stringMultiple(String str){
        String[] strArr = str.split(" ");
        int r = Integer.parseInt(strArr[0]);
        for(char ch : strArr[1].toCharArray()){
            System.out.print(String.valueOf(ch).repeat(r));
        }
        System.out.println();
    }
}