package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex5 {
	
	public static int getSecondSmallest(int a[])
	{
		ArrayList<Integer> List1 = new ArrayList<>();
		int n = a.length;
		
		if(n<=1)
			return -1;
		
		for(int i=0;i<n;i++)
		{
			List1.add(a[i]);
		}
		Collections.sort(List1);
		
		
		return List1.get(1);	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter num : ");
			a[i]=sc.nextInt();
			System.out.println();
		}
		
		System.out.println(getSecondSmallest(a));
		sc.close();
		
	}

}
