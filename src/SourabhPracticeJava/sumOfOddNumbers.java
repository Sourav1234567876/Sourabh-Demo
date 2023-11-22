package SourabhPracticeJava;

import java.util.Scanner;

//Write a function to print the sum of all odd numbers from 1 to n.
public class sumOfOddNumbers {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a value:-");
		int a=sc.nextInt();
		sumOfOddNumbers odd=new sumOfOddNumbers();
		odd.oddNumbers(a);  
	}

public void oddNumbers(int n)
{
	//int a = n;
	int sum=0;
	for(int i=0; i<=n; i++)
	{
		if(i%2!=0)
		{		
			 sum=i+sum;		
		}
	}
	System.out.println("Number is odd"+sum);
}
}
