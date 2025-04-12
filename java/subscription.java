import java.util.Scanner;

public class Maya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 40) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
