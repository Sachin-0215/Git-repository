package abstract_class;

class Monkey{
	public void jump() {
		System.out.println("Jumping...");
	}
	public void bite() {
		System.out.println("Bitting...");
	}
}
interface Animal{
	void eat();
	void sleep();
}
class Human extends Monkey implements Animal {
	public void speak() {System.out.println("Hello Sir");}
	@Override
	public void eat() {System.out.println("Eating...");}
	@Override
	public void sleep(){System.out.println("Eating..and sleeping..");}

}

public class PS2 {

	public static void main(String[] args) {
		Human Sachin = new Human();
		Sachin.eat();
		Sachin.speak();
		Sachin.sleep();
		Sachin.jump();
		Sachin.bite();
		
		Monkey m1 = new Human(); // Polymorphism
		m1.bite();
		m1.jump();
//		m1.speak();  ---> Can't use speak method because the refernce is making which does not have speak method
		
		Animal a = new Human();
		a.eat();
		a.sleep();
//		a.speak();  ---> Can't use speak method because the refernce is making which does not have speak method
		
	}
}
