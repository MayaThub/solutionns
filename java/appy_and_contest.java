import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long k = sc.nextLong();

            
            long x = a, y = b;
            while (y != 0) {
                long temp = y;
                y = x % y;
                x = temp;
            }
            long gcd = x;

            
            long lcm = (a / gcd) * b;

            long countA = n / a;
            long countB = n / b;
            long countBoth = n / lcm;

            long totalSolved = countA + countB - 2 * countBoth;

            System.out.println(totalSolved >= k ? "Win" : "Lose");
        }
        sc.close();
    }
}
