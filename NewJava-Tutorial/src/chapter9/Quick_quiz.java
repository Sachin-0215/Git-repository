package chapter9;

class Circle{
	private int radius;
	public void setRadius(int r) {
		this.radius = r;
	}
	public int getRadius() {
		return radius;
	}
	public float area() {
		return (float)(3.148 * radius *radius);
	}
}

public class Quick_quiz {

	public static void main(String[] args) {
		Circle wheel = new Circle();
		wheel.setRadius(3);
		System.out.println("Area of Earth : "+wheel.area());
	}

}
