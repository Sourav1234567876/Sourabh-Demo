package SourabhPracticeJava;

import java.util.Scanner;

public class arrayProblems {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=sc.nextInt();
	
	System.out.println("Enter numbers one by one: ");
	int numbers[]=new int [size];
	
	//input
	for(int i=0;i<size;i++)
	{
		numbers[i]=sc.nextInt(); 
	}
	
	for(int i=0; i<size; i++)
	{
		System.out.println(numbers[i]);
	}
	//int numbers[]=new int [size];
	
	
	//int marks[]= {10,20,30,40};
//	int marks[]=new int[3];
//	marks[0]=21;
//	marks[2]=22;
//	marks[1]=23;
//	for(int i=0;i<marks.length;i++) {
//	System.out.println(marks[i]);
//	}
}
}
