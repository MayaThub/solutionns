import java.util.Scanner;
public class Cap{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(t*s*b + " KB");
    }
}
