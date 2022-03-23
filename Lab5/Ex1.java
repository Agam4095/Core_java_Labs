package Lab5;

import java.util.Scanner;

@SuppressWarnings("serial")
class AgeException extends Exception{
	
	public AgeException(String s)
	{
		System.out.println(s);
	}
}


public class Ex1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter ur age :: ");
		
		int age = sc.nextInt();
		
		try
		{
			if(age > 15)
			{
				System.out.println("Valid Age ");
			}
			else {
				throw new AgeException("Invalid Age");
			}		
		}
		catch (AgeException a){
			System.out.println(a);
		}
		sc.close();
	}

}
