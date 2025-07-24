import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + sc.nextInt() + 1;
        int originalN = n - 1;
        while (true) {
            if (n <= 1) {
                n++;
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    n++;
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                break;
            }
        }
        System.out.println(n - originalN);
    }
}
