import java.util.Scanner;

public class CF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.printf("%.0f",Math.pow(x,y)%m);
    }
}
