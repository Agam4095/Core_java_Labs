package Lab2;
import java.util.Scanner;
import java.util.Arrays;

public class Ex2 {
	
	static String sortStrings(String arr)
	{
		String res="";
		
		char c_arr[] =arr.toCharArray();
		Arrays.sort(c_arr);
		
		int n=arr.length();
		if(n%2==0) {
			for(int i=0;i<n/2;i++)
				res+=Character.toUpperCase(c_arr[i]);
				
			for(int i= n/2;i<n;i++)
				res+=Character.toLowerCase(c_arr[i]);
		}else
		{
			for(int i=0;i<(n/2)+1;i++)
				res+=Character.toUpperCase(c_arr[i]);
				
			for(int i= (n/2)+1;i<n;i++)
				res+=Character.toLowerCase(c_arr[i]);
			
		}
			
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String: ");
        
		String S=sc.nextLine();
		
		System.out.println(sortStrings(S));
		
		sc.close();
	}

}