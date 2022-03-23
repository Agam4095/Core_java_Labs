package Lab2;

//import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	static int getSorted(int a[]) {
		int res = 0;
		int n = a.length;

		for (int i = 0; i < n; i++) {
			Integer num = a[i];
			String s = new StringBuffer(num.toString()).reverse().toString();
			a[i] = Integer.parseInt(s);
		}
		Arrays.sort(a);

		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");

		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("enter a number :");
			a[i] = sc.nextInt();
		}

		getSorted(a);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	    
		sc.close();
	}

}