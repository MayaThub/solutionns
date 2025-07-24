import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n, s = n;

        while (s > 10) {
            c = s;
            s = 0;
            while (c > 0) {
                int l = c % 10;
                s += l;
                c /= 10;
            }
        }
        
        System.out.println(s);
        
    }
}
