import java.util.Scanner;

public class Maya{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double da = 0, hra = 0;
        int  bs = scanner.nextInt();

        if (bs <= 10000) {
            da = bs * 0.8;
            hra = bs * 0.2;
        }
        else if (bs <= 20000) {
            da = bs * 0.9;
            hra = bs * 0.25;
        }
        else{
            da = bs * 0.95;
            hra = bs * 0.3;
        }

        System.out.printf("%.2f",bs + da+hra);
    }
}
