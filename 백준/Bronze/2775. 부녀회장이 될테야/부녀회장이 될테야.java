import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int floor = sc.nextInt();
            int num = sc.nextInt();
            int[] f0 = getInts(num);
            calculate(floor, num, f0);
            System.out.println(f0[num-1]);
        }
    }

    private static void calculate(int floor, int num, int[] f0) {
        for (int f = 0; f < floor; f++){
            for (int n = 1; n < num; n++){
                f0[n] += f0[n-1];
            }
        }
    }

    private static int[] getInts(int num) {
        int[] f0 = new int[num];
        for(int j = 0; j < num; j++){
            f0[j] = j+1;
        }
        return f0;
    }
}