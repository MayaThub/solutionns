import java.util.Scanner;

public class Maya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();

        System.out.printf("%.2f",5 * (f - 32)/9.00);
    }
}
