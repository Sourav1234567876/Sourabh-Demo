package SourabhPracticeJava;

public class DuplicateElement {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,2,2,7,2,8,2};
	int i,j;
	int value=0;
	int freq=0;
	for(i=0;i<arr.length-1;i++)
	{
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
			value=arr[i];
			}

		

	}			

	}//r
	
	freq++;
	System.out.println("Duplicate number is:"+value);
	System.out.println("Freq. is :"+freq);

}
}
