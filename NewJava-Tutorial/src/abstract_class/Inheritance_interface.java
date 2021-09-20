package abstract_class;

interface sampleInterface{
	void meth1();
	void meth2();
}
interface childsampleInterface extends sampleInterface{
	void meth3();
	void meth4();
}

class MySample implements childsampleInterface{
	public void meth1() {
		System.out.println("Method1");
	}
	public void meth2() {
		System.out.println("Method2");
	}
	public void meth3() {
		System.out.println("Method3");
	}
	public void meth4() {
		System.out.println("Method4");
	}
}

public class Inheritance_interface {

	public static void main(String[] args) {
		MySample s = new MySample();
		s.meth1();
		s.meth2();
		s.meth3();
		s.meth4();

	}

}
