import java.util.Scanner;

public class AOT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        System.out.printf("%.2f", ((c * 9) / 5f) + 32.0);

    }
}
