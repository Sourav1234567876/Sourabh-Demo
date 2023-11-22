package SourabhPracticeJava;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String args[])
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Mapping");
		map.put(22023, "Isn't");
		//map.put(101, "Map");
		map.put(3011, "Easy to learn.");
		map.putIfAbsent(102,  "Collections");
		map.remove(102);
		//map.remove(3011, "Easy to learn.");
//		map.entrySet()
//		.stream()
//		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//		.forEach(System.out::println);
		for(Map.Entry m:map.entrySet())
		{
		System.out.println(m.getKey()+" "+m.getValue());
		}
		HashMap<Integer,String> HM=new HashMap<Integer,String>();
		HM.put(1033, "Collections");
		HM.putAll(map);
		System.out.println("After invoking putALL");
		for(Map.Entry m: HM.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
