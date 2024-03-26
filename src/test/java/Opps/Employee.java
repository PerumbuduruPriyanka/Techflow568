package Opps;

public class Employee {
int Empid;
String Ename;
String EJob;
int Esal;
void Display() {
	System.out.println(Empid);
	System.out.println(Ename);
	System.out.println(EJob);
	System.out.println(Esal);
}
void Show() {
	System.out.println("raghav");
}
	public static void main(String[] args) {
		Employee Em1=new Employee();
		Em1.Empid=12;
		Em1.Ename="priyanka";
		Em1.EJob="QA";
		Em1.Esal=400000;
		Em1.Display();
		Em1.Show();
		
		
		
		

	}

}
