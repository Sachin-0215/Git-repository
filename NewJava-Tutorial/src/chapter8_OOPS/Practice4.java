package chapter8_OOPS;

class Square{
	int side;
	public int area()
	{
		return side*side;
	}
	public int perimeter() {
		return 4*side;
	}
	
}
public class Practice4 {

	public static void main(String[] args) {
		Square sq = new Square();
		sq.side = 4;
		System.out.println("Area of Square : "+sq.area());
		System.out.println("Perimeter of Square : "+sq.perimeter());

	}

}
