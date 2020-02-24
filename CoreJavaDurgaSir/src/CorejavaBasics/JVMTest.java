package CorejavaBasics;

import java.lang.reflect.*;

class Student1{
	public String getName()
	{
		return null;
	}
	public int getMarks()
	{
		return 10;
	}
}

public class JVMTest {

	public static void main(String[] args) throws Exception {
		int count=0;
		Class c = Class.forName("Student1");
		//Class c = Class.forName("java.lang.String"); //77
		//Class c = Class.forName("java.lang.Object");//12
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m)
	{		
			count++;
			System.out.println(m1.getName());
	}
		System.out.println("The number of methode" +count);
	}

}
