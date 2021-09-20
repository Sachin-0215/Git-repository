package inheritance;

class Base{
	public int x;
	
	public int getX() {
		return x;
	}
	public void setX(int X) {
		System.out.println("I am in Base setting X now");
		this.x = X;
	}
	public void print() {
		System.out.println("I am a ___");
	}
}

class Derived extends Base{
	public int y;
	public int getY() {
		return y;
	}
	public void setY(int Y) {
		this.y=Y;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		//Creating an object of base class
		Base b = new Base();
		b.setX(4);
		System.out.println("calling of Base "+b.getX());
		
		
		//Creating an object of derived class
		Derived d = new Derived();
		d.setX(6);
		System.out.println("calling of Derived "+d.getX());

		d.setY(4);
		System.out.println("\ncalling of Derived "+d.getY());
	}

}
