import java.util.*;

class Demo {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();

		int count = 0;
		int sum = 0;

		while(n > 0){
			int rem = n % 10;
			count ++;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println(sum / count);
	} 
}