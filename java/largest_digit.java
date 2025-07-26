import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1;

        while (n > 0) {
            int l = n % 10;
            n = n / 10;

            if (l > max) {
                max = l;
            }
        }
        System.out.println(max);
    }
}
