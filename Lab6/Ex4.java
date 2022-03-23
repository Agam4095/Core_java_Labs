package Lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
	HashMap<Integer, Integer> mp = new HashMap<>();
	int val=0,key=0;
	Scanner sc = new Scanner(System.in);
	
	while(key!=-1)
	{
		System.out.println("Enter Reg. num: ");
		key = sc.nextInt();
		if(key == -1)
			break;
		System.out.println("Enter marks: ");
		val = sc.nextInt();
		
		mp.put(key, val);
		
	}
	HashMap<Integer, String> mp1 = getStudents(mp);
	
	for(Map.Entry entry : mp1.entrySet())
    {
    	System.out.println(entry.getKey()+ " " + entry.getValue());
    }
	
	}

	private static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> mp) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mp1 = new HashMap<>();
		
		for(Map.Entry entry : mp.entrySet())
	    {
	    	//System.out.println(entry.getKey()+ " " + entry.getValue());
			int marks = (int) entry.getValue();
			int key = (int) entry.getKey();
			if(marks >= 90)
			{
				mp1.put(key, "Gold");
			}
			else if(marks >=80 && marks <90)
			{
				mp1.put(key, "Silver");
			}
			else if(marks >=70 && marks <80)
			{
				mp1.put(key, "Bronze");
			}
			else
			{
				mp1.put(key, "No Medal");
			}
			
			
	    }
		
		
		return mp1;
	}

}
