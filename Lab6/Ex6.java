package Lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex6 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> mp = new HashMap<>();
		int val=0,key=0;
		Scanner sc = new Scanner(System.in);
		
		while(key!=-1)
		{
			System.out.print("Enter your Eid: ");
			key = sc.nextInt();
			
			if(key == -1)
				break;
			System.out.print("Enter your Age: ");
			val = sc.nextInt();
			
			mp.put(key, val);
			
		}
		
		List<Integer>voterList1 = votersList(mp);
		
		System.out.println(voterList1.toString());
		
		sc.close();
	}

	private static List<Integer> votersList(HashMap mp) {
		
		Set set = mp.entrySet();
	    Iterator itr = set.iterator();
	    List<Integer> List1 = new ArrayList<>();
	    while(itr.hasNext())
	    {
	    	Map.Entry map = (Map.Entry)itr.next();
	    	
	    	if((Integer)map.getValue() > 18)
	    	{
	    		List1.add((Integer) map.getKey());
	    	}
	    }
		
		
		return List1;
	} 
	

}
