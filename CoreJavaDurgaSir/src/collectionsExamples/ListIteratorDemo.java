package collectionsExamples;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("AAA");
		l.add("BBB");
		l.add("CCC");
		l.add("DDD");
		
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			String s = (String) ltr.next();
			if(s.equals("AAA"))
			{
				ltr.remove();
			}
			if(s.equals("BBB"))
			{
				ltr.set("3B");
			}
			if(s.equals("CCC"))
			{
				ltr.add("EEE");
			}
		}
		
		System.out.println(l);
	}

}
