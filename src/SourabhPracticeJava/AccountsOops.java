package SourabhPracticeJava;

class Account{
	int acc_no;
	String name;
	double balance;
	void insert(int a, String n,double b)
	{
		acc_no=a;
		name=n;
		balance=b;
	}
	void deposit(double b)
	{
		balance=balance+b;
		System.out.println("Balance after deposit is:"+balance);
	}
	void withdrawn(double d)
	{
		if(balance<d)
		{
		System.out.println("Insufficent balance");	
		}
		else 
		{
			balance=balance-d;
			System.out.println("Balance after withdrawn: "+balance);
		}
	}
	void checkBalance()
	{
		System.out.println("Balance is:-" +balance);
	}
	void display() {
		System.out.println(acc_no+" "+name+" "+balance);
	}
}
public class AccountsOops {
	public static void main(String[] args) {
		Account a=new Account();
		
		a.insert(111,"Sourabh ", 50000);
		a.display();
		//a.insert(112, "Lalita", 80000);
		a.deposit(75000);
		a.checkBalance();
		a.withdrawn(50000);
		a.checkBalance();
		a.display();
	}

}
