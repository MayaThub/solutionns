import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else if (n == 2) {
            isPrime = true;
        } else if (n % 2 == 0) {
            isPrime = false;
        } else {
            int sqrt = (int)Math.sqrt(n);
            for (int i = 3; i <= sqrt; i += 2) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
