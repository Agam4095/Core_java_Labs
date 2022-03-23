package Lab1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		 System.out.println("Enter the number n to print the in fabonicci series ");
	        Scanner sc = new Scanner(System.in);
	        short a=sc.nextShort();
	        Series ob1=new Series();
	        long b=ob1.input(a);
	        System.out.println("The number at "+a+" of the faboniccs series is "+b);
		
		
		
		
		
		
	}

}
class Series 
{
    
    int a=1;
    int b=1;
    int c=0;
    int count;
    int input(int a)
    {
        count=a;
        count=fab(count);
        return count;
    }
    
    int fab(int count)
    {
        if(count!=2)
        {
            c=a+b;
            a=b;
            b=c;
            fab(--count);
        }
        return c;
    }
}