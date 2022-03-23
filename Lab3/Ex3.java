package Lab3;

import java.util.Scanner;


public class Ex3 {
	static boolean isVowel(char ch)
    {
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'
            && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O'
            && ch != 'U') {
            return false;
        }
        return true;
    }
	
	static String alterString(String S)
	{
		String result="";
		
		char arr[]=S.toCharArray();
		int n=S.length();
		
		for(int i=0;i<n;i++)
		{
			if(!isVowel(arr[i]))
			{
				if(arr[i]=='z' || arr[i]=='Z')
					arr[i]=arr[i];
				else
				    arr[i]=(char) ((char)arr[i] + 1);	
			}
			result += arr[i];
				
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");

		String input = sc.nextLine();
        
		System.out.println(alterString(input));
		
		sc.close();
	}

}
