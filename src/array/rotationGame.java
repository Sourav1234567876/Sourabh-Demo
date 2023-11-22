package array;

import java.util.Scanner;

public class rotationGame 
{
	public static void main(String[] args)
	{
		try(Scanner scanner = new Scanner(System.in))
		{
		String[] input = scanner.nextLine().trim().split(" ");
		int times = Integer.parseInt(scanner.nextLine().trim());
		
		//convert String Array to int Array
		if(input.length > 0){
			 int[] array = new int[input.length - 1];
			 
             for (int i = 1; i < input.length; i++) 
             {
                 array[i - 1] = Integer.parseInt(input[i]);
             }
			
			int[] rotated = rotated(array, times);
            for (int i = 0; i < array.length; i++) 
            {
                System.out.print(array[i] + " ");
            }
		}
	}
	}
	static int[] rotated(int[] array, int times)
	{
		times = times%array.length;
		reverseArray(array, 0, array.length - 1);
        reverseArray(array, 0, times - 1);
        reverseArray(array, times, array.length - 1);
		return array;
	}
	
	static void reverseArray(int[] array, int start, int end)
	{
		if(start>=end) return;
		while(start<end)
		{
			swap(array, start, end);
			start++;
			end--;
		}
	}
	
	static void swap(int[] array, int source, int target)
	{
		if(source>=target) return;
			int temp = array[source];
			array[source] = array[target];
			array[target] = temp;
	}
	
}
