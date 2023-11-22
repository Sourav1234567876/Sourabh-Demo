package SourabhPracticeJava;

public class MinMaxOfArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,2,1,4,9,0};
	int maximum= arr[0];
//	int smallest =arr[0];
//finding the maximum number in an array
	for(int i=0;i<arr.length;i++)
	{
		if(maximum<arr[i])
		{
			maximum=arr[i];
		}
	}		System.out.println("Maximum number is:"+maximum);

//	for(int i=0;i<arr.length;i++)
//	{
//		if(smallest>arr[i])
//		{
//			smallest=arr[i];
//		}
//		
//
//	}
//	System.out.println("Smallest number is:"+smallest);


}

}
