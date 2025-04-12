import java.util.Scanner;
public class Class{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int res = y%100;
        if(res<10)
            System.out.println("0" + res);
        else
            System.out.println(y%100);
    }
}
