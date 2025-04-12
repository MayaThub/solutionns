import java.util.Scanner;
public class Frames{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cp = scanner.nextInt();
        int sp = scanner.nextInt();

        int pft = sp - cp ;
        double pp = (pft * 100 ) / ( cp + 0.00 );

        System.out.printf("%.2f",pp);    
    }
}
