import java.util.Scanner;

public class CF{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if (ch >= 65 && ch <= 91)
            System.out.println("uppercase alphabet");
        else if (ch >= 97 && ch <= 123)
            System.out.println("lowercase alphabet");
        else
            System.out.println("not an alphabet");

    }
}
