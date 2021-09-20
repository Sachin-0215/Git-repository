package chapter9;

class Cylinder{
	private int radius;
	private int height;
	
	public Cylinder(int radius,int height) {
		this.radius=radius;
		this.height=height;
	}
	public void setHeight(int h) {
		this.height = h;
	}
	public void setRadius(int r) {
		this.radius = r;
	}
	public int getHeight() {return height;}
	public int getRadius() {return radius;}
	
	public double volume() {
		return (Math.PI * radius * radius * height);
	}
	public double surface_Area() {
		return 2*Math.PI*radius*radius + 2*3.142*height*radius;
	}
}

public class Practice {

	public static void main(String[] args) {
		Cylinder obj = new Cylinder(9,12);
		
		
//		obj.setHeight(12);obj.setRadius(9);
//		System.out.println(obj.getHeight());
//		System.out.println(obj.getRadius());
		
		
		System.out.println(obj.volume());
		System.out.println(obj.surface_Area());

	}

}
