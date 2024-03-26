package Opps;

public class Employee1 {
	String name;
	int Id;
	String Job;
	int Sal;
	Employee1(String name,int Id,String Job,int Sal)
	{
	this.name=name;
	this.Id=Id;
	this.Job=Job;
	this.Sal=Sal;
	}
	void Display()
	{
	System.out.println(name);
	System.out.println(Id);
	System.out.println(Job);
	System.out.println(Sal);
	}
	public static void main(String[] args){
	Employee1 em=new Employee1("priyanka",1,"tester",1000);
	em.Display();
	}

}
