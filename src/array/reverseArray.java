package array;

public class reverseArray 
{
	public static void main(String[] args)
	{
		int[] arr = {3,5,7,9};
		int[] array = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			array[i] = arr[arr.length-1-i];
			System.out.println(array[i]);

		}

	}

}
