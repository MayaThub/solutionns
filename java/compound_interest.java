import java.util.Scanner;

public class CF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int r = scanner.nextInt();
        int t = scanner.nextInt();

        double a = p  * Math.pow(1 + (r/100.00),t);

        System.out.printf("%.2f",a - p);
    }
}

