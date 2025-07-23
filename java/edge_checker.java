import java.util.Arrays;
import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = Math.abs(a - b);

        if (diff == 1 || diff == 9) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
            
        }
    }
}
