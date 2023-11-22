package SourabhPracticeJava;

public class RightRotateArray {
public static void main(String[] args) {
	int arr[]=new int[] {2,4,6,2,4,8,9};
	int n=3;
	
	System.out.println("Original arrays:-");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Right Rotate arrays:-");
   for(int i=0;i<n;i++)
   {
	   int j,last;
	   last=arr[arr.length-1];
	   for( j=arr.length-1;j>0;j--)
	   {
		   arr[j]=arr[j-1];
	   }
	   arr[0]=last;
   }
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	   System.out.println();
   }
}
   
	


