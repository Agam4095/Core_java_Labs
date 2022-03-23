package Lab3;

import java.util.Scanner;

public class Ex2 {
	
	static String getImage(String S)
	{
		String reverse = new StringBuffer(S).reverse().toString();
		
		String result = S +'|'+ reverse;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");

		String input = sc.nextLine();
        
		System.out.println(getImage(input));
		
		sc.close();
	}

}
