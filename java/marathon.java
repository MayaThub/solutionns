import java.util.Arrays;
import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;

        if (b > a) 
            count++;
        if (c > a)
            count++;
        if (d > a)
            count++;

        System.out.println(count);
    }
}
