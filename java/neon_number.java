import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        int c = sq, s = 0;

        while (c > 0) {
            int l = c % 10;
            s += l;
            c /= 10;
        }
        if (n == s) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}
