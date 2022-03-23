package Lab1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		Ex6.calculateDifference(num);
	}
	static void calculateDifference(int num) {
		int sum = 0;
		int sqr_sum = 0;
		for(int a = 1;a<=num;a++) {
			
			sum += a;
			sqr_sum += a*a;
			
		}
		System.out.println(" Sum is " + sum );
		System.out.println(" Sum of squares " + sqr_sum);
		System.out.println(" Difference is " + (sqr_sum - sum*sum));
	}
}
