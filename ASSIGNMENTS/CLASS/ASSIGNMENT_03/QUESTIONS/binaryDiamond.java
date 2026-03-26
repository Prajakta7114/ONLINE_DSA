import java.util.*;

class Demo {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n-i; j++){
				System.out.print(" ");
			}
			int val = (i % 2 == 1) ? 1:0;
			for(int j = 1; j <= i; j++){
				System.out.print(val + " ");
				val = 1 - val;
			}
			System.out.println();
		}

		for(int i = n-1; i >=1; i--){
			for(int j = 1; j <= n-i; j++){
				System.out.print(" ");
			}
			int val = (i % 2 == 1) ? 1:0;
			for(int j = 1; j <= i; j++){
				System.out.print(val + " ");
				val = 1 - val;
			}
			System.out.println();
		}
	}
}