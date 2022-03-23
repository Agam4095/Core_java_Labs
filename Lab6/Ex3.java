package Lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
	
	public static HashMap getSquares(int[] arr)
	{
		
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(int c: arr)
		{
			mp.put(c,c*c);
		}
		return mp;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,10,5,6,7,8,9};
		
		HashMap<Integer, Integer> mp = getSquares(arr);
		
		for(Map.Entry entry : mp.entrySet())
	    {
	    	System.out.println(entry.getKey()+ " " + entry.getValue());
	    }
		
		
		
	}

}