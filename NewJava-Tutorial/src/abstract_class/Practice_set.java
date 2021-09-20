package abstract_class;

//Practice 1

abstract class Pen{
	abstract void write();
	abstract void refill();
}

class Reynolds extends Pen{
	void write() {
		System.out.println("Writing....");
	}
	void refill() {
		System.out.println("Refill");
	}
	void changeNib() {
		System.out.println("Changing Nib");
	}
}
public class Practice_set {

	public static void main(String[] args) {
		Reynolds P1 = new Reynolds();
		P1.changeNib();
		P1.write();
		P1.refill();

	}

}
