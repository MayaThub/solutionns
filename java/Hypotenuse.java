import java.util.Scanner;

public class FraHypotenusemes{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.printf("%.2f",Math.sqrt( (x*x) + (y*y) ));
    }
}