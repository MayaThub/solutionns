import java.util.Scanner;

public class CF{
    static void isFact(Scanner scanner){
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a==b) {
            System.out.println("YES");
            return;
        }

        while (a <= (b/2) ) {
            if (b%a == 0) {
                System.out.println("YES");
                return;
            }
            a++;
            b++;
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            isFact(scanner);
        }
    }
}
