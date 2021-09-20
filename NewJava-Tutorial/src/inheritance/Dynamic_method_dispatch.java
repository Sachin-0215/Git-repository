package inheritance;

class Phone{
	public void showTime() {
		System.out.println("Time is 8 am");
	}
	public void on() {
		System.out.println("Turning on Phone.....");
	}
}
class SmartPhone extends Phone{
	public void Music() {
		System.out.println("Playing Music...");
	}
	public void on() {
		System.out.println("Turning on SmartPhone.....");
	}
}

public class Dynamic_method_dispatch {

	public static void main(String[] args) {
//		Phone obj = new Phone(); // Object created on runtime
//		SmartPhone smobj = new SmartPhone();
//		obj.on();
		Phone obj = new SmartPhone(); // allowed
		obj.showTime();
		obj.on();
//		obj.Music(); // not allowed
//		SmartPhone obj2 = new Phone(); // Not allowed

	}

}
