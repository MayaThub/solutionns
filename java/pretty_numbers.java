import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
            
            for (int i = a; i <= b; i++) {
                int l = i%10;

                if (l == 2 || l == 3 || l == 9) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
