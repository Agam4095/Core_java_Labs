	package Lab6;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;

	public class Ex7 {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter size of array : ");
			int n = sc.nextInt();
			List<Integer> a = new ArrayList();
			for(int i=0;i<n;i++)
			{
				System.out.print("Enter num : ");
				a.add(sc.nextInt());
				System.out.println();
			}
			System.out.print("Output : ");
			System.out.print(getSorted(a).toString());
			sc.close();
		}

		private static List getSorted(List a) {
			int n = a.size();
			List<Integer> a2 = new ArrayList();
			for(int i=0;i<n;i++)
			{
				Integer num = (Integer) a.get(i);
				String s1= num.toString();
				s1=reverse(s1);
				a2.add(i, Integer.parseInt(s1));;
			}
			Collections.sort(a2);
			
			
			return a2;
		}

		private static String reverse(String s1) {
			int n=s1.length();
			String s2 = "";
			for(int i=n-1;i>=0;i--)
				s2 += s1.charAt(i);
			
			
			return s2;
		}

	}
