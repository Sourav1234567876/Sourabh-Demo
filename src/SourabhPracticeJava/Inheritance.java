package SourabhPracticeJava;
 class Family
{
	public void walk()
	{
		System.out.println("Everyone is walking");
	}
	public void walk(String s)
	{
		System.out.println("Overloading");
	}
}
// class override extends Family{
//	 public void walk()
//	 {
//		 System.out.println("Everyone is overriding");
//	 }
// }
//public class Inheritance extends override{
//	public static void main(String[] args) {
//		override f=new override();
//		f.walk();
//	}
 public class Inheritance extends Family
 {
	 public static void main(String[] args) {
		Family f=new Family();
		f.walk("Sourabh");
	}
 }


