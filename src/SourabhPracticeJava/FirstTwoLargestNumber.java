package SourabhPracticeJava;

public class FirstTwoLargestNumber {
public static void main(String[] args) {
	int arr[]= {2,3,4,1,9,8,5};
	int i;
	int n=arr.length;
	int l=arr[n];
	int sl=arr[n];
	int tl=0;
	for(i=1;i<n-1;i++)
	{
		if(l>arr[i])
		{
			l=arr[i];
			sl=l;
		}
		else if(sl>arr[i])
		{
		sl=arr[i];	
		}
	}
	System.out.println(l);
	System.out.println(sl);


//	{
//		if(arr[i]>l)
//		{
//		sl=l;
//		
//		l=arr[i];
//		}
//		else if(arr[i]>sl)
//		{
//			tl=sl;
//
//			sl=arr[i];
//			
//		}
//		else if(arr[i]>tl)
//		{
//			tl=arr[i];
//		}
//		
//	}
//	System.out.println(tl);
//	System.out.println(sl);
//	System.out.println(l);
}

}
