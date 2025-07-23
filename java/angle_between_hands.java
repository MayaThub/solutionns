import java.util.Scanner;

public class Sol{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();// 21:25

        float h = Float.parseFloat(str.substring(0, 2));
        float m = Float.parseFloat(str.substring(3, 5));

        float ma = m * 6;
        float ha = h * 30 + (m/2);

        float ang = Math.abs(ha - ma);
        if (ang > 180) 
            ang = 360 - ang;
        
        System.out.println(ang);
    }
}
