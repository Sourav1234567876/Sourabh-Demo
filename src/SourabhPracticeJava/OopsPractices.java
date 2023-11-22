package SourabhPracticeJava;
class Student{
	int id;
	String name;
	void insertRecord(int i,String n)
	{
		id=i;
		name=n;
	}
	void displayInformation() {
		System.out.println(id+" "+name);
	}
}
public class OopsPractices {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.insertRecord(101,"Sourabh");
		s2.insertRecord(102, "Lalita");
		s1.displayInformation();
		s2.displayInformation();
//		s1.id=101;
//		s1.name="Sourabh";
//		s2.id=102;
//		s2.name="Lalita";
//		System.out.println(s1.id +" "+ s1.name);
//		System.out.println(s2.id +" "+ s2.name);
		//System.out.println(s1.id);
		//System.out.println(s1.name);
		
				
	}

}
