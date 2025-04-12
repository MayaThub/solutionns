import java.util.Scanner;

public class Maya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        if (r < 3) {
            System.out.println("LIGHT");
        }
        else if (r < 7) {
            System.out.println("MODERATE");
        }
        else{
            System.out.println("HEAVY");
        }
    }
}
