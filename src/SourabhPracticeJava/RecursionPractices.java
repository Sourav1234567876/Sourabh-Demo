package SourabhPracticeJava;
//Print number from 1 to 5;
public class RecursionPractices {
	public static int printFact(int n) {
	if(n==1||n==0)
	{
		
		return 1;
	}

	int fact_nm1=printFact(n-1);
		int fact =n*fact_nm1;
		return fact;
		
	}
	public static void main(String[] args) {
		int n=6;
	int ans=	printFact(n);
		System.out.print(ans);
	}
	
//	public static void printSum(int i,int n,int sum)
//	{
//		if(i==n) {
//			sum=sum+i;
//			System.out.print(sum);
//			return;
//		}
//		sum=sum+i;
//		
//		printSum(i+1,n,sum);
//		System.out.println(i);
//	}
//	public static void main(String[] args) {
//	printSum(1,7,0);
}
//	public static void printNumb(int n)
//	{
//		if(n==21)
//		{
//			return;
//		}
//		System.out.print(" "+n);
//		printNumb(n+1);
//	}
//public static void main(String[] args) {
//	int n=1;
//	printNumb(n);
//}

