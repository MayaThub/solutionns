import java.util.Scanner;

public class CF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int r = scanner.nextInt();
        int t = scanner.nextInt();

        System.out.println(p*t*r/100);
    }
}
