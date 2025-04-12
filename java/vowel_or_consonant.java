import java.util.Scanner;

public class CF{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char ch = scanner.next().toUpperCase().charAt(0);

        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("VOWEL");
        } else {
            System.out.println("CONSONANT");
            
        }
        
    }
}
