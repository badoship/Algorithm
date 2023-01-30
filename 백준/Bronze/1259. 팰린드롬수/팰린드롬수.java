import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb;
        while (true) {
            String str = bf.readLine();
            if ( str.equals("0")) break;
            sb = new StringBuffer(str);
            printReverseSame(sb, str);
        }
        bf.close();
    }

    private static void printReverseSame(StringBuffer sb, String str) {
        if ( str.equals(sb.reverse().toString()) ){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}