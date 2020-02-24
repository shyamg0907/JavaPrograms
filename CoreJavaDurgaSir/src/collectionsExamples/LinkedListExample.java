package collectionsExamples;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
	
		LinkedList LL = new LinkedList();
			LL.add("A");
		LL.add("Linked");
		LL.add(null);
		LL.add(12);
		LL.set(0, "firts");
		LL.add(0,"f1");
		LL.addFirst("ffff");
		LL.removeLast();
		//LL.remove(2);
		
		System.out.println(LL);

	}

}
