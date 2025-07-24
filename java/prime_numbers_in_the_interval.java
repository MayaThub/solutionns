import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int j = a; j < b; j++) {
            if (j <= 1) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i * i <= j; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(j);
            }
        }
    }
}
