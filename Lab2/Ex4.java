package Lab2;

import java.util.*;

public class Ex4 {

	public static int modifyArray(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");

		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			int j=i+1;
			System.out.println("Enter " + j + " number : ");
			a[i] = sc.nextInt();
		}
		int n1 = modifyArray(a, n);

		Arrays.sort(a);
		for (int i = n1-1; i >=0 ; i--)
			System.out.println(a[i]);

		sc.close();
	}

}
