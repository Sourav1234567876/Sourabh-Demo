package SourabhPracticeJava;

import java.util.Scanner;

//Write a function that calculates the Greatest Common Divisor of 2 numbers.

public class greatestCommanDivisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener 1st number: ");
		int a=sc.nextInt();
		System.out.println("Ener 2nd number: ");
		int b=sc.nextInt();
		int gcd=1;
		
		for(int i=1; i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
				
			}
		}
		System.out.println("Greatest Comman divisor is:  "+gcd);

	}
}
