import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int bag = 0;
        while (sugar > 0) {
            if ( sugar % 5 == 0 ){
                bag += sugar / 5;
                break;
            }
            sugar -= 3;
            bag++;
        }

        System.out.println("" + (sugar < 0 ? -1 : bag ));

    }

}