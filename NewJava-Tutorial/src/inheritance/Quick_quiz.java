package inheritance;

class Animal{
	public void walking(){
		System.out.println("Walking....");
	}
	public void eating() {
		System.out.println("Eating...");
	}
	
}

class Dog extends Animal{
	public void voice() {
		System.out.println("Bow Bow....");
	}
}

public class Quick_quiz {

	public static void main(String[] args) {
		Dog sheru = new Dog();
		sheru.walking();
		sheru.eating();
		sheru.voice();

	}

}
