import java.util.*;

class SpiralPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size = 2*n - 1;
        int mid = size / 2;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){

                int rowDist;
                if(i > mid)
                    rowDist = i - mid;
                else
                    rowDist = mid - i;

                int colDist;
                if(j > mid)
                    colDist = j - mid;
                else
                    colDist = mid - j;

                int dist;
                if(rowDist > colDist)
                    dist = rowDist;
                else
                    dist = colDist;

                int value = n - dist;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}