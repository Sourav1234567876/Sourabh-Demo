package SourabhPracticeJava;

public class ArrayInAscendin {
public static void main(String[] args) {
	int arr[]= {9,5,10,12,7,6};
	int temp=0;
	int i,j;
	for( i=0;i<arr.length-1;i++)
	{
		for( j=i+1;j<arr.length;j++)
		{
//			if(arr[i]>arr[j])
//			{
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
		if(arr[i]<arr[j])
		{
			temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
			
		}
	
		
	}
	for(i=0;i<arr.length;i++)
	{
		System.out.print(" "+arr[i]);
	}

}
}
