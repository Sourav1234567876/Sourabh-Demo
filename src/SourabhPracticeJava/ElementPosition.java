package SourabhPracticeJava;

public class ElementPosition {
public static void main(String[] args) {
	int arr[]= {1,2,77,3,77,45,6,77,77,98,8};
	
	//Even number on even index.
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0&&i%2==0)
		{
			System.out.println("Number is even and on even index:- "+arr[i]);
		}
	}
	
	
	
	
	
//	int i,j;
//	int n=77;
//	int count=0;
//	for(i=0;i<arr.length;i++)
//	{
//		if(arr[i]==n)
//		{
//			System.out.println("77 is on index:- "+i);
//			count++;
//		}
//
//		
//	}
//	System.out.println("Frequency of n is:- "+count);

}
}
