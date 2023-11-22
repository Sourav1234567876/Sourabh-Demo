package SourabhPracticeJava;

public class MissingElement {
public static void main(String[] args) {
	int arr[]= {1,2,4,5,6};
	int sum=0;
	//int l=arr.length;
	int n=6;
	for(int i=0;i<arr.length;i++)
	{
		sum+= arr[i];
		
	}
	System.out.println(sum);
	int Sum=n*(n+1)/2-sum;
	System.out.println(Sum);
}
}
