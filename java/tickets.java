import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n*4 < 1000) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
