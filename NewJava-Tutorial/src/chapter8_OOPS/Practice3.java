package chapter8_OOPS;

class Rectangle{
	float length;
	float breadth;
	public float area() {
		return length * breadth;
	}
	public float perimeter() {
		return 2*(length+breadth);
	}
	public void setValue(int l,int b)
	{
		length=l;
		breadth=b;
	}
}

public class Practice3 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.setValue(4,3);
		System.out.println("Area of Rectangle : "+rec.area());
		System.out.println("Perimeter of Rectangle : "+rec.perimeter());

	}

}
