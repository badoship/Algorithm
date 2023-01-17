import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        String operator = sc.nextLine();
        BigInteger b = new BigInteger(sc.nextLine());
        if(operator.equals("*")){
            System.out.println(a.multiply(b));
            return;
        }
        System.out.println(a.add(b));
    }
}