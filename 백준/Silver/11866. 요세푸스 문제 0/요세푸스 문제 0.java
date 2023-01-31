import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        Queue<int[]> que = initQueue(n);
        yspsPrint(k, que);
    }

    private static void yspsPrint(int k, Queue<int[]> que) {
        System.out.print("<");
        while (!que.isEmpty()) {
            for (int i = 1; i < k; i++) {
                que.add(que.poll());
            }
            System.out.print("" + que.poll()[0] + (que.isEmpty() ? ">" : ", "));
        }
    }

    private static Queue<int[]> initQueue(int n) {
        Queue<int[]> que = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            que.add(new int[]{i});
        }
        return que;
    }
}