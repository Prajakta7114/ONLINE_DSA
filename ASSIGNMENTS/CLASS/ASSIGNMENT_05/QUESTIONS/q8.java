import java.util.*;

class CountDivisor{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int i = 1;
		while(i <= n){
			if(n % i == 0){
				System.out.print(i+ " ");
				
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println(count);
	}
}