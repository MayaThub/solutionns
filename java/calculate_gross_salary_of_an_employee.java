import java.util.Scanner;

public class AOT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double s = scanner.nextDouble();
        double hra = scanner.nextDouble();
        double da = scanner.nextDouble();

        double pf = (s * 3) / 25;
        double gs = s + hra + da + pf;
        System.out.printf("%.2f\n",pf);
        System.out.printf("%.2f",gs);

    }
}
