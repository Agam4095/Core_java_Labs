package Lab3;

import java.util.Scanner;
import java.util.*;

public class Ex8 {
	
	static boolean check(String S)
	{
		boolean f = false;
		
		char a[]= S.toCharArray();
		char b[]= S.toCharArray();
		Arrays.sort(a);
		
		if(Arrays.equals(a, b))
			return true;
		
		return f;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String S = sc.nextLine();
		
		if(check(S))
			System.out.println(S + "is a positive String.");
		else
			System.out.println(S + " is not positive String");
		
		sc.close();
	}

}