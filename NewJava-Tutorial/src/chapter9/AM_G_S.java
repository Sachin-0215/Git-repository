package chapter9;

class MyEmployee{
	private int id;
	private String name;
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return name;
	}
	public void setId(int ID) {
		this.id = ID;
	}
	public int getId() {
		return id;
	}
}
public class AM_G_S {

	public static void main(String[] args) {
		MyEmployee Person = new MyEmployee();
//		Person.id = 10;
//		Person.name = "Sachin Gupta";---->  Throws an error due to private access modifiers
		
		Person.setName("Sachin Gupta");
		Person.setId(91);
		System.out.println("ID : "+Person.getId()+"\t");
		System.out.print("EMP NAME : "+Person.getName());
	}

}
