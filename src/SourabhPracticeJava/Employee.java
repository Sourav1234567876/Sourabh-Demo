package SourabhPracticeJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee implements Comparable<Employee>{
	int id,age;
	String name;
	

	public Employee(int id,int age, String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
		
	}
	
	public String toString()
	{
		return id+" "+age+" "+name;
	
	}
	
	public int compareTo(Employee emp)
	{
		if(age==emp.age)
			return 0;
		else if(age>emp.age)
			return 1;
		else	
			return -1;
		
	}
	
	
	
	
	
	public static void main(String args[])
	{
	Employee E1=new Employee(16,26,"Sourabh");
	Employee E2=new Employee(14,27,"Lalita");
	Employee E3=new Employee(19,25,"Nitin");
	Employee E4=new Employee(28,29,"Mohit");

	List<Employee> al=new ArrayList<Employee>();
	al.add(E1);
	al.add(E2);
	al.add(E3);
	al.add(E4);

	Iterator<Employee> itr=al.iterator();

	//Employee emp;
	//while(itr.hasNext())
		
	{
	//	emp=itr.next();
		//System.out.println(itr.next().toString());
//System.out.println(emp.id+" "+emp.age+" "+emp.name);	
	}
	
	Collections.sort(al);
	for(Employee em:al)
	{
		System.out.println(em.id+" "+em.age+" "+em.name);
		
	}
	
	
	//al.removeall(al);
	//System.out.println(al);
   // Collections.sort();
	  

	}

}