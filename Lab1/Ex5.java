package Lab1;

import java.util.Scanner;

public class Ex5 {
public static void main(String[] args) {
		System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Ex5.calculateSum(n);
	
}
static void calculateSum(int n) {
	int sum = 0;
	for(int a = 1;a<=n;a++) {
		if(a%3==0 || a%5==0 ) {
			sum+=a;
		}
	}
	System.out.println(sum);
}
}
