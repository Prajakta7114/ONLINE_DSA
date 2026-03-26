import java.util.*;

class PrimeNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 2;

		while(num <= n){
			int i = 2;
			boolean isPrime = true;

			while(i < num){
				if(num % i == 0){
					isPrime = false;
					break;
				}
				i++;
			}
			if(isPrime){
				System.out.print(num + " ");
			}
			num++;		
		}
	}
}