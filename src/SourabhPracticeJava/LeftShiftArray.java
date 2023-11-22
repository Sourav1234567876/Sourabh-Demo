package SourabhPracticeJava;

public class LeftShiftArray {
public static void main(String[] args) {
	int arr[]= {2,4,3,6,8,1,6};
	//New arr[]={4,3,6,8,1,6,2};
	int temp=0;
	int n=arr.length;
	int i;
	for(i=0;i<n;i++)
	{
		System.out.print(" "+arr[i]);
	
	}
	
	temp = arr[0];
	for(i=1;i<=n-1;i++)
	{
		arr[i-1]=arr[i];
		
	}
	arr[n-1]=temp;
	System.out.println();
//	System.out.println("Arrays after shifting :"+arr[i]);
	for(i=0;i<n;i++)
	{
		System.out.print(" "+arr[i]);
	}
}
}
