package com.javaPractice;

import java.util.Scanner;

public class first {
	
	public static void main(String[] args)
	{
		//System.out.println("hello");
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i<=arr.length; i++)
		{
			for(int j=i; j<=arr.length; j++)
			{
				sum =  sum+arr[j];
                
                if(sum==value)
                {
                    System.out.println(i);
                    System.out.println(j);
                }
                
			}
		}
	}
}
