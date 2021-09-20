package chapter9;

class Rectangle{
	private int length;
	private int breadth;
	
	public Rectangle() {
		this.breadth=5;
		this.length=9;
	}
	public Rectangle(int l,int b) {
		this.length=l;
		this.breadth=b;
	}
	public int Area() {
		return length*breadth;
	}
	public int perimeter() {
		return 2*(length+breadth);
	}
}

public class Practice4 {

	public static void main(String[] args) {
		Rectangle box = new Rectangle(15,2);
		System.out.println("Area : "+box.Area());
		System.out.println("Perimter : "+box.perimeter());

	}

}
