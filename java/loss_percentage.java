import java.util.Scanner;
public class Loss_percentage{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cp = scanner.nextInt();
        int sp = scanner.nextInt();
        int loss = cp - sp ;
        double lp = (loss * 100 ) / ( cp + 0.00 );

        System.out.printf("%.2f",lp);
    }
}
