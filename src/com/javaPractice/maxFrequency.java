package com.javaPractice;

public class maxFrequency 
{
	
	public static void main(String[] args)
	{
		int[] arr = {2,5,1,4,8,0,8,1,3,8};
		int max_count =0;
		int max_frequency = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>max_count)
			{
				max_count = count;
				max_frequency = arr[i];
			}
		}
		System.out.println(max_count +" times "+ max_frequency );
		
	}

}
