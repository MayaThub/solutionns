import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prot = 1, sum = 0;

        while(n > 0){
            int l = n % 10;
            n /= 10;
            prot *= l;
            sum += l;
        }
        System.out.println(Math.abs(prot - sum));
    }
}
