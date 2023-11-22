package array;
import java.util.HashSet;
import java.util.Set;

public class goodPair 
{
	
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5};
		int num = 3;
		
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i]+array[j]==num)
				{
					System.out.println(1);
				}
			}
		}
		
//		Set <Integer> set = new HashSet<>();
//		 for (int i : array) {
//	            Integer value = Integer.valueOf(i);
//	            set.add(value);
//	        }
//       
//		for(int i=0; i<array.length; i++)
//		{
//			if(set.contains(num-array[i]))
//			{
//				System.out.println(1);
//			}
//			set.add(array[i]);
//		}
//		System.out.println(0);
		
	}

}
