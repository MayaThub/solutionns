import java.util.Scanner;

public class CF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = l; i <= r; i++) {
            if (i%k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
