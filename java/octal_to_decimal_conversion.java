 import java.util.Scanner;

public class CF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oct = scanner.nextInt();
        int i = 0,res = 0;
        while (oct != 0) {
            int l = oct % 10;
            oct /= 10;
            res += l * Math.pow(8, i++);
        }
        System.out.println(res);
    }
}
