import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int orin = n;
            int fs = 0;

            while (n > 0) {
                int l = n % 10;
                n /= 10;
                int f = 1;
                
                while (l > 0) {
                    f = f * l;
                    l--;
                }
                fs += f;
            }

            if (orin == fs) {
                System.out.println("Strong");
            } else {
                System.out.println("Not Strong"); 
            }
        }

    }
}
