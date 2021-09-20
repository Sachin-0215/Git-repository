package abstract_class;

//class Base{
abstract class Base{
	public Base() {
		System.out.println("Mein Base Class Ka Constructor");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	abstract public void greet();
	abstract public void greet2();
}

class child extends Base{
	@Override
	public void greet() {
		System.out.println("Good Morning");
	}
	@Override
	public void greet2() {
		System.out.println("Good Afternoon");
	}
}
abstract class child2 extends Base{
	public void th() {
		System.out.println("Hii");
	}
}
public class Abstract_class {

	public static void main(String[] args) {
//		Base b = new Base(); error
		child c = new child();
//		child2 cd = new child2(); error
	    c.sayHello();
		
	}

}
