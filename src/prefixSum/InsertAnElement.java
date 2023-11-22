package prefixSum;

public class InsertAnElement {
public static void main(String[] args) {
	int arr[]= {7,8,12,3,9};
	int value=27;
	int temp=0;
	int i;
	
	int newArr[]= new int[arr.length+1];
	
	for(i=0;i<3;i++)
	{
		newArr[i]=arr[i];
	}
	newArr[3]=value;
	
	for(i=3;i<arr.length;i++)
	{
		newArr[i+1]=arr[i];
	}
	for(i=0;i<newArr.length;i++)
	{
	System.out.println(newArr[i]);
}
}
//	
//	
//	int arr[]= {7,8,12,3,9};
//	int value=27;
//	int temp=0;
//	
//	int arr1 = arr.length + 1;
//    int[] newArray = new int[arr1];
//
//    for (int i = 0; i<3 ; i++) {
//    	newArray[i] = arr[i];
//    }
//
//    newArray[3] = value;
//    
//    for (int i =3; i < arr.length; i++) {
//        newArray[i + 1] = arr[i];
//    }
//    
//	for(int i=0;i<newArray.length;i++)
//	{
//		System.out.println(newArray[i]);
//	}
//	
//}
}
