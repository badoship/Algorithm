import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[][] nums = new int[n][2];

        for(int i = 0; i < n; i++ ){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            nums[i][0] = Integer.parseInt(st.nextToken());
            nums[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums, (o1, o2) -> {
            if( o1[1] == o2[1] ){
                return o1[0] - o2[0];
            }
            else{
                return o1[1] - o2[1];
            }
        });

        for (int[] num : nums) {
            System.out.println(num[0] + " " +num[1]);
        }

        bf.close();

    }
}