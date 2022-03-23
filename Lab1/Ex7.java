package Lab1;

import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Ex7.checkNumber(num);
	}
	static void checkNumber(int num) {
		boolean a = false;
	
		 int currentDigit = num % 10;
	       num = num/10;

	       while(num>0){
	
	           if(currentDigit <= num % 10){
	               a = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
	       }
	       if(a){
	           System.out.println(" The number is not increasing.");
	       }else{
	           System.out.println(" The number is increasing.");
	}
	
	

}
}
