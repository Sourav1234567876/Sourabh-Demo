package SourabhPracticeJava;
//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class greaterOfTwo {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("First number:-");
    int a=sc.nextInt();
    System.out.print("Second number:-");
    int b= sc.nextInt();
    
    greaterNumber(a, b);
    }

public static void greaterNumber(int a,int b)
{
	if(a>b)
	{
		System.out.println("Greater number is "+a);
	}
	else
	{
		System.out.println("Greater number is "+b);
	}
}
}
