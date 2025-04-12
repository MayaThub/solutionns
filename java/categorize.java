import java.util.Scanner;

public class CF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float h = scanner.nextFloat();
        if (h < 150) {
            System.out.println("Person is Dwarf.");
        }
        else if (h <= 165) {
            System.out.println("Person is average heighted.");
        }
        else if (h <= 195) {
            System.out.println("Person is taller.");
        }
        else{
            System.out.println("Abnormal height.");
        }
    }
}
