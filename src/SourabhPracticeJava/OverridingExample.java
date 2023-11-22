package SourabhPracticeJava;
class Bank
{
  int getRateOfInterest()
  {
	  return 0;
  }
}
  class SBI extends Bank
  {
	  int getRateOfInterest()
	  {
		  return 8;
	  }
  }
	  class Pnb extends Bank
	  {
		int getRateOfInterest()
		{return 7;
	  }
	  }
	  
 

public class OverridingExample {
	public static void main(String[] args) {
		Pnb p=new Pnb();
		SBI s=new SBI();
		System.out.println(p.getRateOfInterest());
		System.out.println(s.getRateOfInterest());
	}

}
