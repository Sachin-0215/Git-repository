package chapter8_OOPS;

class Employee1{
	int Salary;
	String name;
	
	public int getSalary(){
		return Salary;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
}
public class Practice1 {

	public static void main(String[] args) {
		// Problem 1:
		Employee1 sachin = new Employee1();
		sachin.setName("Sachin Gupta");
		sachin.Salary = 828;
		System.out.println("Salary is : "+sachin.getSalary());
		System.out.println("Name : "+sachin.getName());

	}

}
