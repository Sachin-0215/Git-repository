package chapter9;

class Employees{
	private int id;
	private String name;
	private int Salary;
	
	// Constructor Overloading
	public Employees() {
		id = 45;
		name = "Your-Name-Here";
	}
	public Employees(String myName,int myId) {
		id = myId;
		name = myName;
	}
	public Employees(int myId,String myName,int mySalary) {
		name = myName;
		Salary = mySalary;
	}
	
	public void setName(String n) { this.name = n;}
	public String getName() { return name;}
	public void setId(int ID) {this.id = ID;}
	public int getId() {return id;}
	public void setSalary(int salary) {this.Salary = salary;}
	public int getSalary() {return Salary;}
}
public class Constructors{
		public static void main(String[] args) {
			Employees person = new Employees("Sachin Gupta",46);
			Employees person2 = new Employees(1,"Sonu",1000);
			
			System.out.println(person.getName());
			System.out.println(person.getId());
			
			System.out.println(person2.getName());
			System.out.println(person2.getId());
			System.out.println(person2.getSalary());
		}

}
