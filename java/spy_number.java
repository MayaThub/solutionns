import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        
        while (n > 0) {
            int l = n%10;
            n = n/10;

            sum += l;
            prod *= l;
        }
        if (prod == sum) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }
}
