import java.util.*;

class GCD {
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int i = 1;
		int gcd = 1;
		while(i <= a && i <= b){
			if (a % i == 0 && b % i == 0){
				gcd = i;
			}
			i++;
		}
		System.out.println(gcd);
	}
}