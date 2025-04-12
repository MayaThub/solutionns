import java.util.Scanner;

public class Maya{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ( i != j && arr[j] < arr[i] ) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
