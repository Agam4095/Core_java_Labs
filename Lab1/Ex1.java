package Lab1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Ex1.CubeSum();
	}
	
static void CubeSum() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int num = sc.nextInt();
	int sum = 0;
	while(num > 0) {
		int mod = num%10;
		sum = sum + (int)Math.pow(mod,3);
		num = num / 10;
	}
	System.out.println("Output =" +sum);
	sc.close();
}
}
