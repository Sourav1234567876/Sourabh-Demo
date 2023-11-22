package SourabhPracticeJava;

public class RightShiftArray {
public static void main(String[] args) {
	int arr[]= {2,4,3,6,8,1,6};
	int temp=0;
	int n=arr.length;
	int i;
	for(i=0;i<n;i++)
	{
		System.out.print(" "+arr[i]);
		temp = arr[n-1];
	}
	
	
	for(i=n-1;i>=1;i--)
	{
		arr[i]=arr[i-1];
	}
		
	arr[i]=temp;
	
	System.out.println();
	
	System.out.println("Arrays after shifting:");
	for(i=0;i<n;i++)
	{
		System.out.print(" "+arr[i]);
	}
}
}
