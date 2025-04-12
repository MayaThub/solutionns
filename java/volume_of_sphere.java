import java.util.Scanner;
public class Frames{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        System.out.printf("%.2f",(4 * 3.14 * r * r * r)/3);    
    }
}
