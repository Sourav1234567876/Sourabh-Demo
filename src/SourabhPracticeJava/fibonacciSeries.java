package SourabhPracticeJava;
//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 .....
public class fibonacciSeries {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int n=9;
	int sum;
	System.out.println(a);
	System.out.println(b);
	for(int i=0;i<=n;i++)
	{
		sum= a+b;
		a=b;
		b=sum;
		System.out.println(sum);
	}
} 
}
