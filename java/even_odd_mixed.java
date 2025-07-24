import java.util.Scanner;

public class Sol{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isOdd = true;
        boolean isEven = true;

        while (n > 0) {
            int l = n % 10;
            n = n / 10;

            if ((l & 1) == 1) {
                isEven = false;
            } else {
                isOdd = false;
            }
        }
        if (isOdd) {
            System.out.println("Odd");
        } else if (isEven) {
            System.out.println("Even");
        } else {
            System.out.println("Mixed");
        }
    }
}
