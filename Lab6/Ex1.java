package Lab6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Ex1 {
	
	public static List getValues(HashMap mp)
	{
		Set set = mp.entrySet();
	    Iterator itr = set.iterator();
	    
	    while(itr.hasNext())
	    {
	    	Map.Entry map = (Map.Entry)itr.next();
	    	System.out.println("key : "+ map.getKey()+ " Value : " + map.getValue());
	    }
	    List list = new LinkedList(mp.entrySet());  
	    
	    Collections.sort(list, new Comparator()   
	    {  
		    public int compare(Object o1, Object o2)   
		    {  
		    return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());  
		    } 
	    });
	    

		return list;
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		hm.put(1, 154);
		hm.put(2, 3335);
		hm.put(3, 109);
		hm.put(4, 194);
		hm.put(5, 935);
		hm.put(6, 609);
		
		System.out.println(getValues(hm).toString());
		
	}

}
