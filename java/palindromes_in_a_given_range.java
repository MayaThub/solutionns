import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i < b; i++) {
            int n = i;
            int r = 0;
            
            while (n > 0) {
                int l = n % 10;
                n = n / 10;
                r = (r*10) + l;
            }
            if (i == r) {
                System.out.print(i + " ");
            }
        }
    }
}
