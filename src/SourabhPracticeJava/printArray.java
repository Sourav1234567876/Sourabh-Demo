package SourabhPracticeJava;

import java.util.Scanner;

//Printing Array of int. 
public class printArray {
public static void main(String[] args) {

	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Size of the arrays:-");
	 int size=sc.nextInt();
	 int elements[]=new int[size];
	 System.out.println("Enter the elements of Array:-");
	 for(int i=0;i<size;i++)
	 {

		 elements[i] =sc.nextInt();
		//4
		// System.out.print(elements);

	 
	 }
	 for(int i=0;i<size;i++)
		System.out.print("  "+elements[i]);

}
}
