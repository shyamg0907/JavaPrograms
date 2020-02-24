package collectionsExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {
	
	public static void main(String args[])
		{
			HashMap m= new HashMap();
			m.put("aaaa", 1000);
			m.put("bbbb", 2000);
			m.put("cccc", 3000);
			m.put("dddd", 4000);
			//System.out.println(m.put("bbbb", 2000));
			
			Set s = m.keySet();
			//System.out.println(s);
			Collection c=m.values();
			System.out.println(c);
			Set s1=m.entrySet();
			Iterator itr= s1.iterator();	
			while(itr.hasNext())
			{
				Map.Entry m1=(Map.Entry)itr.next();
				//System.out.println(m1.getKey()+"......."+m1.getValue());
				if(m1.getKey().equals("aaaa"))
				{
					m1.setValue(100);
				}
				
				System.out.println(m1);
			}
			
			
	    }

}
