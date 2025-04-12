import java.util.Scanner;
public class MoveCnt{

    static int getMoves(int x, int y){
        int moves = 0;
        while (x >= y) {
            x -= y;
            moves++;
        }
        return moves + x;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(getMoves(x,y));

        }
    }
}
