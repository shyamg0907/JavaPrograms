package collectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList AL = new ArrayList();
		
		AL.add("A");
		AL.add("A");
		AL.add(11);
		AL.add('a');
		
		//AL.add(null);
		//System.out.println(AL);
		//AL.remove(2);
		
		//AL.add(2, "Delete");
		AL.add("null");
		List l1 = Collections.synchronizedList(AL);
		//AL.size();
		System.out.println(l1.size());
		System.out.println(l1);
		//AL.clear();
		//AL.addAll(AL);
		System.out.println(AL);
		System.out.println(AL.removeAll(AL));
		System.out.println(AL);
	}

}
