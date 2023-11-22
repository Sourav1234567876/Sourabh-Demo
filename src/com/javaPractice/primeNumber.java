package com.javaPractice;

import java.util.Scanner;

public class primeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<=1)
		{
			System.out.println("NO");
		}
		else
		{
			for(int i=2; i<=Math.sqrt(a); i++)
			{
				if(a%i==0)
				{
					System.out.println("NO");
					return;
				}
				System.out.println("Yes");
			}
		}

	}

}
