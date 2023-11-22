package carryForward;

import java.util.HashSet;
import java.util.Set;

public class assignment1 
{

	public static void main(String[] args)
	{
		Set<Integer> hashSet = new HashSet<Integer>();
		int count =0;
		int[] nums = {1,2,3,1,2,3,1,2};
		
		for(int i=0; i<nums.length; i++)
		{
			//we r checking here if element is already present in subarray or not
			if(hashSet.contains(nums[i])==false)
			{
				//if element not found, then add it in subarray
				hashSet.add(nums[i]);
			}
			else {
				//if element already present in subarray, than we r creating new subarray here and increasing the value of count.
				count++;
				
				//clear old elements 
				hashSet.clear();
				
				//adding new element
				hashSet.add(nums[i]);
			}
		}
		//
		System.out.println(count);
	}
}
