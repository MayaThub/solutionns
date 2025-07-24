import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        boolean isNegative = n < 0;
        n = Math.abs(n);

        while (n > 0) {
            int l = n % 10;
            r = r * 10 + l;
            n /= 10;
        }
        if (isNegative) {
            r = -r;
        }
        System.out.println(r);
    }
}
