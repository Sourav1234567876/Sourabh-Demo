package SourabhPracticeJava;
//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class circumferanceOfCircle {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the radius of the circle:-");
		double r=sc.nextDouble();
		circumferance(r);
		
	}
	public static void circumferance(double r)
	{
		double z=2*3.14*r;
		System.out.println("Circumferance of circle is:-"+z);
	}

}
