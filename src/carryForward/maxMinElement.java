package carryForward;

import java.util.Scanner;

public class maxMinElement 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().trim().split(" ");
		
		int[] arr = new int[array.length-1];
		
		for(int i=1; i<array.length; i++)
		{
			arr[i-1] = Integer.parseInt(array[i]);
		}

		  int maxElement = Integer.MIN_VALUE;
	      int minElement = Integer.MAX_VALUE;

	        for(int i=0; i<arr.length; i++)
	        {
	        	 minElement = Math.min(minElement, arr[i]);
	             maxElement = Math.max(maxElement, arr[i]);
	        }
	        System.out.println(maxElement);
	        System.out.println(minElement);
		
	}

}
