import java.util.Arrays;
import java.util.Scanner;

public class CF{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a = (a>b) ? a : b;
        b = scanner.nextInt();
        a = (a>b) ? a : b;
        System.out.println(a);
        
    }
}
