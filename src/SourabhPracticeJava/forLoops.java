package SourabhPracticeJava;

import java.util.Scanner;

public class forLoops {
//Enter 3 numbers from the user & make a function to print their average.

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1 numbers:-");
		int a=sc.nextInt();
		System.out.print("Enter 2 numbers:-");
		int b = sc.nextInt();
		System.out.print("Enter 3 numbers:-");
		int c = sc.nextInt();	
	    forLoops fl=new forLoops();
	    fl.averageValue(a, b, c);
		
		}
	
	public void averageValue(int a,int b,int c)
	{
		int average=(a+b+c)/2;
		System.out.println("Average of 3 numbers are :-"+average);
		
	}
}
