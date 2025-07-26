import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 1;

        for (int i = 2; i <= Math.ceil(a/2); i++)
            if (a % i == 0)
                sum += i;
        if (sum == b)
            System.out.println("Amicable");
        else
            System.out.println("Not Amicable");
    }
}
