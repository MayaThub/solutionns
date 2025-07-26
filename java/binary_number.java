import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = (int)Math.pow(2, n);

        for (int i = 1; i <= r; i++) {
            float d = 2;

            for (int j = 1; j <= n; j++) {

                int c = (int)Math.ceil(i / ((r/d)));

                if (( c & 1 )== 1) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
                d *= 2;
            }

            System.out.print("\n");
        }
    }
}
