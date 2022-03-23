package Lab1;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		Ex8.checkNumber(num);
	}
	static void checkNumber(int num) {
		boolean a = false;
		while(num%2==0) {
			num = num/2;
		}
		if(num==1) {
			System.out.println("The number is a power of 2");
		}
		else {
			System.out.println("The number is not the power of 2");
		}
	}

}
