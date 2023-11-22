package com.javaPractice;

public class reverseArray 
{
	
	public static void main(String[] args)
	{
		int[] arr = {3,-2,1,4,6,9,8};
		
		for(int i=0; i<=arr.length; i++)
		{
			for(int j=arr.length-1; j>i; j--)
			{
				while(i<=j)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		System.out.println(arr);
	}

}
