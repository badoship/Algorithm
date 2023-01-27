import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < k; i++){
            int num = Integer.parseInt(bf.readLine());
            if (num == 0) {
                st.pop();
            }
            else {
                st.push(num);
            }
        }

        System.out.printf("" + st.stream().mapToInt(Integer::intValue).sum());

        bf.close();

    }
}