package Lab3;

import java.util.*;


public class Ex4 {
	
	static int modifyNumber(int n)
	{
		Integer t = n;
		String s = t.toString();
		int t1=s.length();
		char a[]=s.toCharArray();
		int res=0;
		for(int i=0;i<t1-1;i++)
		{
			Integer num1 = Character.getNumericValue(a[i]);
			Integer num2 = Character.getNumericValue(a[i+1]);
			
			int diff = num1 - num2;
			res = res * 10 + Math.abs(diff); 
			
		}
		res = res * 10 + (n%10);
		
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int n = sc.nextInt();
		
		System.out.println(modifyNumber(n));
		sc.close();
		
	}
	
}
