package Lab5;

import java.util.Scanner;

@SuppressWarnings("serial")
class MissingException extends Exception{
	
	public MissingException(String s)
	{
		System.out.println(s);
	}
}

public class Ex2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Firstname :");
		String FirstName = sc.nextLine();
		System.out.println("Enter Lastname :");
		String LastName = sc.nextLine();
		try {
			if(FirstName.length() == 0)
				throw new MissingException("FirstName is blank");
			else if(LastName.length() == 0)
				throw new MissingException("LastName is blank");
			else {
				String FullName = "";
				FullName = FirstName +" "+ LastName;
				System.out.println(FullName);
			}
				
		}
		catch(MissingException a) {
			System.out.println(a);
		}
		
		
		
		sc.close();
	}

}
