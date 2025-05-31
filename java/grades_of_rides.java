import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();

        if(h > 50 && s1 > 60 && s2 > 100) {
            System.out.println("10");
        } else if(h > 50 && s1 > 60) {
            System.out.println("9");
        } else if(s1 > 60 && s2 > 100) {
            System.out.println("8");
        } else if(h > 50 && s2 > 100) {
            System.out.println("7");
        } else if(h > 50 || s1 > 60 || s2 > 100) {
            System.out.println("6");
        } else {
            System.out.println("5");
        }
        
    }
}
