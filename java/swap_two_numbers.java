import java.util.Scanner;

public class CF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println(a + "\n" +  b);
    }
}

