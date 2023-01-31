import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testCase; i++) {

            StringTokenizer nAndTarget = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(nAndTarget.nextToken());
            int target = Integer.parseInt(nAndTarget.nextToken());

            StringTokenizer strNums = new StringTokenizer(bf.readLine());
            Queue<int[]> que = new LinkedList<>();
            Integer[] temp = new Integer[n];
            int idx = 0;
            while (strNums.hasMoreTokens()) {
                int num = Integer.parseInt(strNums.nextToken());
                que.add(new int[]{idx, num});
                temp[idx] = num;
                idx++;
            }
            Arrays.sort(temp, Collections.reverseOrder());
            int seq = 0;

            loop1:
            for (Integer num : temp) {
                seq++;
                while (!que.isEmpty()) {
                    int[] q = que.remove();
                    if (q[1] == num) {
                        if (q[0] == target) {
                            System.out.println(seq);
                            break loop1;
                        }
                        break;
                    }
                    else {
                        que.add(q);
                    }
                }

            }

        }
        bf.close();
    }
}