package chapter8_OOPS;

class Employee
{
	int id;
	String name;
	int salary;
	public void printDetails(){
		System.out.println("\nMy Id is "+id);
		System.out.println("And My Name is "+name);
	}
	public int getSalary() {
		return salary;
	}
}
public class Class {

	public static void main(String[] args) {
		System.out.println("This is a custom Class");
		Employee sachin = new Employee(); //Instantiating a new Employee object
		Employee john = new Employee();
		
		//Setting attributes
		sachin.id = 12;
		sachin.name = "Blogger";
		sachin.salary = 83;
		
		john.id = 13;
		john.name = "John Abrahim";
		john.salary = 34;
		
		
		// Printing the attributes
		sachin.printDetails();
		john.printDetails();
		
		// System.out.print(Sachin.id+"\n"+Sachin.name);
		
		

	}

}
