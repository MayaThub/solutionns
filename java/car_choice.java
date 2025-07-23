import java.util.Arrays;
import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            float x1 = sc.nextFloat();
            float x2 = sc.nextFloat();
            float y1 = sc.nextFloat();
            float y2 = sc.nextFloat();
    
            if ((1/x1) * y1 > (1/x2) * y2) {
                System.out.println(1);
            } else if ((1/x1) * y1 < (1/x2) * y2) {
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        }
    }
}
