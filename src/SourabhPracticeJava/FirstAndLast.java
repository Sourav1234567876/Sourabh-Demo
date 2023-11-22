package SourabhPracticeJava;

public class FirstAndLast {
public static void main(String[] args) {
	String s="Sourabh Bholo";
	for(int i=0; i<s.length();i++)
	{
		if(s.charAt(i)=='o')
		{
			System.out.println("First occurance of o is: "+i);
			break;
		}
	}
	for(int i=s.length()-1;i>=0;i--)
	{
		if(s.charAt(i)=='o')
		{
			System.out.println("Last occurance of o is: "+i);
			break;
		}
	}
}
}
