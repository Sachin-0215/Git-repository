package inheritance;

class Circle{
	public int radius;
	Circle(){
		System.out.println("I am a Circle Non Parameterised Constructor");
	}
	
	Circle(int r){
		System.out.println("I am a Circle Parameterised Constructor");
		this.radius = r;
	}
	public double area() {
		return Math.PI*radius*(radius);
	}
}
class Cylinder extends Circle{
	
	public int height;
	Cylinder(int h,int r)
	{
		super(r);
		System.out.println("I am a Cylinder Parameterised Constructor");
		this.height = h;
	}
	public double volume() {
		return Math.PI*(radius*radius)*height;
	}
	
}

public class Practice1 {

	public static void main(String[] args) {
		Cylinder obj = new Cylinder(2,4);
		System.out.println(obj.volume());

	}

}
