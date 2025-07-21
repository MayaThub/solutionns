import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mc = 0, lc = 0;
        
        for (int i = 0; i < n; i++) {
            int ip = sc.nextInt();
            if (ip == 1) {
                lc++;
            }
            else{
                mc = Math.max(mc, lc);
                lc = 0;

            }
        }
        mc = Math.max(mc, lc);
        System.out.println(mc);
    }
}
