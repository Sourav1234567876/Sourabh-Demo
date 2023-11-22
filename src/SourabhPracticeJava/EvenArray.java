package SourabhPracticeJava;

public class EvenArray {
public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4,5,6,7,8,9,0};
	System.out.println("Original arrays:-");

	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}System.out.println();
	System.out.println("Even arrays:-");

	for(int i=1;i<=arr.length;i=i+2)
	{
		System.out.print(arr[i]+" ");
	}
}
}
