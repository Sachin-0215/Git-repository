package inheritance;

class base{
	base(){
		System.out.println("Main ek constructor hoon");
	}
	base(int x){
		System.out.println("Main overloaded constructor hoon a value k sath : "+x);
	}
	
}
class derived extends base{
	derived(){
//		super(10);
		System.out.println("I am a derived class constructor");
	}
	derived(int x,int y){
		super(x);
		System.out.println("I am a overloaded derived class constructor with two arguments : "+x+" "+y);
	}
}
class child_derived extends derived{
	child_derived(){
//		super(10);
		System.out.println("I am a child_derived class constructor");
	}
	child_derived(int x,int y,int z){
		super(x,y);
		System.out.println("I am a overloaded child_derived class constructor with three arguments : "+x+" "+y+" "+z);
	}
}

public class Constructors_in_inheritance {

	public static void main(String[] args) {
//		base b = new base();
//		derived d = new derived(4,2);
		child_derived cd = new child_derived(2,5,9);
		
		
	}

}
