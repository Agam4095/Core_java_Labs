package Lab2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter size of array");
		int length = sc.nextInt();
		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter element: " + (i + 1));
			arr[i] = sc.nextInt();
		}

		for (int a : arr) {
			System.out.println(a);
		}

		sc.close();
		Ex1.getSecondSmallest(arr, length);
	}
	static void getSecondSmallest(int arr[],int length) {
		int temp;
		for(int i = 0;i<length;i++) {
			
			for(int j = i+1;j<length;j++){
				
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		System.out.println("Second Smallest element is" + arr[1]);
	}

}
