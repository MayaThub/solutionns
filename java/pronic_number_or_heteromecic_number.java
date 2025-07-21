import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i * i < n; i++) {
            if ( n <= (i + 1) * (i + 1) && n == i * (i+1)) {
                System.out.println("YES");
                return;
            }
        }
            System.out.println("NO");
    }
}
