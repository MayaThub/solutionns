import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = x + y*2;

        if ((sum & 1) == 1) {
            System.out.println("NO");
            return;
        }

        int half = sum / 2;
        if ((y & 1) == 1) {
            if (x == 0) {
                System.out.println("NO");
                return;
            }
            if ((half - (y / 2 ) * 2) + (half - (y / 2 + 1) * 2) == x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        else  {
            System.out.println("YES");
        }
    }
}
