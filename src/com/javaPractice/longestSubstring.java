package com.javaPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class longestSubstring 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int res =0;
		ArrayList<Character> visited = new ArrayList<>();
		for(int i=0; i<word.length(); i++)
		{
			for(int j=i; j<word.length(); j++)
			{	
				if(visited.contains(word.charAt(i)))
				{
					break;
				}
				else
				{
					visited.add(word.charAt(i));
				}
			}
		}
		System.out.println(visited);
	}

}
