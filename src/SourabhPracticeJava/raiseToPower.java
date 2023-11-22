package SourabhPracticeJava;

import java.util.Scanner;

//Two numbers are entered by the user, x and n. Write a function to 
//find the value of one number raised to the power of another i.e. .
public class raiseToPower {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Base:-");
    int a=sc.nextInt();
    System.out.println("Enter the Exponent:-");
    int b=sc.nextInt();
    double result=1;
    
    while(b!=0)
    {
    	b--;
    	result=result*a;
    	
    }
    System.out.println("Power of Ab is:   "+result);
}
{
     	
}
}
