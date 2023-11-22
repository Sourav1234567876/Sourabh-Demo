package SourabhPracticeJava;

public class EvenOddArrays {
public static void main(String[] args) {
	System.out.println("Original array:-");
	int arr[]=new int[] {1,2,3,4,6,2,7,8,9,1};
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Printing Odd and Even arrays");
for(int i=0;i<arr.length;i++)
{
   if(arr[i]%2==0)
   {
	   System.out.print(arr[i]+" ");

   }
   else
   {
	   System.out.print(arr[i]+" ");
  }
   System.out.println();


}
}
}
