package SourabhPracticeJava;

public class LargestElementOfArray {
public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4,5,6,7,12,8,9};
	System.out.println("Original arrays:-");

	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}System.out.println();
//	int Max=arr[0];
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i]>=Max)
//		
//			 Max=arr[i];
//	}
//	System.out.print(Max);
int Min=arr[0];
for(int i=0;i<arr.length;i++)
{
   if(arr[i]<=Min)
   {
	   Min=arr[i];
   }
}
System.out.print(Min);

}
}
