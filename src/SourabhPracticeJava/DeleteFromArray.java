package SourabhPracticeJava;

public class DeleteFromArray {
public static void main(String[] args) {
	int arr[]= {7,8,12,3,9};
	int pos=2;
	int i;
	int arrNew[]=new int[arr.length-1];
	
	for(i=0;i<2;i++)
	{
      arrNew[i]= arr[i];
			
	}
	arrNew[i]=arr[i+1];
	
	for(int j=pos+1; j<arr.length-1; j++)
	{
		arrNew[j]=arr[j+1];
	}
	
	for(i=0;i<arrNew.length;i++)
	{
		System.out.println(arrNew[i]);
	}
	
	
}
}
