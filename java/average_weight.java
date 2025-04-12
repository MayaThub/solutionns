import java.util.Scanner;
public class Cap{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int w1 = scanner.nextInt();
        int w2 = scanner.nextInt();

        System.out.println((3*x)-w1-w2);
    }
}
