import java.util.*;

class DiamondNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        // Upper half
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int s = 1; s <= n-i; s++)
                System.out.print(" ");

            // numbers
            for(int j = 1; j <= i; j++)
                System.out.print(num++ + " ");

            System.out.println();
        }

        // Lower half
        for(int i = n-1; i >= 1; i--) {

            // spaces
            for(int s = 1; s <= n-i; s++)
                System.out.print(" ");

            // numbers
            for(int j = 1; j <= i; j++)
                System.out.print(num++ + " ");

            System.out.println();
        }
    }
}