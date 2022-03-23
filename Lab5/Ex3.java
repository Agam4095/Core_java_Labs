package Lab5;

import java.util.Scanner;

@SuppressWarnings("serial")
class EmployeeException extends Exception{
	
	public EmployeeException(String s)
	{
		System.out.println(s);
	}
}

public class Ex3 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter ur salary :: ");
		
		int salary = sc.nextInt();
		
		try
		{
			if(salary < 3000)
			{
				throw new EmployeeException("Invalid salary");
			}
			else
				System.out.println("Have a good day.");
				
		}
		catch (EmployeeException a){
			System.out.println(a);
		}
		sc.close();
	}
	
}
