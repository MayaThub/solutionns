import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int n = i, temp = i;
            boolean isSDN = true;

            while (n > 0) {
                int d = n % 10;
                if (d == 0 || temp % d != 0) {
                    isSDN = false;
                    break;
                }
                n /= 10;
            }

            if (isSDN) {
                System.out.print(i + " ");
            }
        }
    }
}
