import java.util.Scanner;

public class Maya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1 = scanner.nextInt() + scanner.nextInt();
        int c2 = scanner.nextInt() + scanner.nextInt();
        if (c1 > c2) {
            System.out.println(c2);
        }
        else{
            System.out.println(c1);
        }
    }
}
