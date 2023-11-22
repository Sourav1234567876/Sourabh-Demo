package SourabhPracticeJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collections {
	public static void main(String args[])
	{
		List<String> AL=new ArrayList<String>();
	
		
		AL.add("Sourabh");
		AL.add("Is");
		AL.add("Lalita's");
		AL.add("Husband");
		Iterator itr=AL.iterator();
		while(itr.hasNext())
		{
		System.out.println(""+itr.next());
		}
		AL.remove(1);
		
		System.out.println(AL);
		
		//AL.clear();
		//System.out.println(AL);
		//AL.contains("Is");
		System.out.println(AL.contains("Is"));
		
		String str=AL.get(2);
		System.out.println(str);
		
		AL.add(2, "Don't know");
		System.out.println(AL);
		
List<String> LL= new LinkedList<>();
LL.add("1");
LL.add("awer");
AL.addAll(2, LL);
		System.out.println(AL);
		
		AL.addAll(LL);
		System.out.println(AL);
		
		System.out.println(AL.containsAll(LL));
		
		System.out.println(AL.equals(LL));
		
		System.out.println(AL.indexOf("Sourabh"));
		
		System.out.println(AL.isEmpty());
		

		System.out.println(AL.lastIndexOf("Husband"));
		
		System.out.println(AL.size());
		
		//AL.replaceAll(Lali);
		System.out.println(AL);
		
			
	
	}

}
