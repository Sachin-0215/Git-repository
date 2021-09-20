package inheritance;

class ekclass{
	int x;
	ekclass(int x){
		this.x=x;
	}
	public int returnone(){
		return 1;
	}
	public int getX() {
		return x;
	}
}
class doclass extends ekclass{
	doclass(int x){
		super(x);
		System.out.println("Main ek constructor");
	}
}

public class this_super {

	public static void main(String[] args) {
		ekclass e = new ekclass(65);
		doclass d = new doclass(5);
			
		System.out.println(e.getX());
		

	}

}
