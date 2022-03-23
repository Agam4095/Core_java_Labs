package Lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
	
	public static HashMap countChars(char[] ch)
	{
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		
		int n= ch.length;
		
		for(char c: ch)
		{
			if(mp.containsKey(c))
			{
				mp.put(c, mp.get(c) + 1);
			}
			else
			{
				mp.put(c,1);
			}
		}
		
		return mp;
	}
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
	    String s = "ayushkumar";
	    
	    int n = s.length();
	    
	    char[] ch = new char[n];
	    
	    for(int i=0;i<n;i++)
	    {
	    	ch[i] = s.charAt(i);
	    }
	    HashMap<Character, Integer> mp = countChars(ch);
	    
	    for(Map.Entry entry : mp.entrySet())
	    {
	    	System.out.println(entry.getKey()+ " " + entry.getValue());
	    }
	    
	    //sc.close();
		
	}

}
