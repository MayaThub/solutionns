import java.util.Arrays;
import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int l = n % 10;
        int f = 0;
        while (n > 0) {
            f = n % 10;
            n /= 10;
        }

        System.out.println(f + l);
    }
}
