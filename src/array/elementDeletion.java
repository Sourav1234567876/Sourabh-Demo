package array;

public class elementDeletion
{
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,5,6,7};
		int num = 5;
		int count=0;
		
		for(int j=0; j<arr.length-1; j++)
		{
			if(arr[j]==num)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(-1);
		}
		
		int elementDeletions=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]>num)
			{
				elementDeletions +=1;
			}
		}
		System.out.println(elementDeletions);
	}

}
