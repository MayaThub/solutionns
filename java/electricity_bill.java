import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int u = scanner.nextInt();
        double bill = 0,i = 0,sc = 0;

        if (u < 200 )
            i = 1.2;
        else if (u < 400)
            i = 1.4;
        else if (u < 600)
            i = 1.6;
        else if (u < 800)
            i = 1.8;
        else
            i = 2.0;

        bill = u * i;

        if (bill > 400)
            sc = bill * 0.15; // Adding 15% surcharge if bill exceeds

        System.out.printf("Units Consumed: %d\n", u);
        System.out.printf("Cost per Unit: %.2f\n", i);
        System.out.printf("Bill: %.2f\n", bill);
        System.out.printf("Surcharge: %.2f\n", sc);
        System.out.printf("Total Amount: %.2f\n", (bill + sc));
    }
}
