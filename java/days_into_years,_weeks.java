import java.util.Scanner;
public class Class{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();

        System.out.print((d/365) + " " + ((d%365)/7));
    }
}
