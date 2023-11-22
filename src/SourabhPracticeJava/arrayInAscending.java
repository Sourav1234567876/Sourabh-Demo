package SourabhPracticeJava;

public class arrayInAscending {
public static void main(String[] args) {
int arr[]=new int[]{2,4,3,6,8,1,6};
int temp=0;

	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
		
	}
	System.out.println();
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}

		}
	}
		for(int j=0;j<arr.length;j++)
		{
		System.out.print(arr[j]+" ");
		}
	
}
}
