import java.util.Arrays;
import java.util.Scanner;

public class CF{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = 0;
        for (int i = 0; i < 5; i++) {
            marks += scanner.nextInt();
        }
        
        marks = marks / 5;

        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 80) {
            System.out.println("Grade B");
        }
        else if (marks >= 70) {
            System.out.println("Grade C");
        }
        else if (marks >= 60) {
            System.out.println("Grade D");
        }
        else if (marks >= 40) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }
        
    }
}
