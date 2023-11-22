package SourabhPracticeJava;

public class ReverseArray {
public static void main(String[] args) {
	int arr[]=new int[] {1,3,5,7,8,3};
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}

}
