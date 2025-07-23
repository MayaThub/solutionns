import java.util.Arrays;
import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if (Math.pow(n, 2) < Math.pow(2, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
