import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        int sqrt = (int) Math.sqrt(n);

        System.out.println( sqrt * sqrt == n ? "True" : "False" );
    }
}
