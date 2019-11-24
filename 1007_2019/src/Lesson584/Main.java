package Lesson584;



class Box{

	Object o;

	public Box(Object o) {
		this.o = o;
	}
	public Object get() {
		return o;
	}
}


public class Main {
	public static void main(String[] args) {

		Box b = new Box("Hello");
		String s = (String)b.get();
		System.out.println(s);
	}

}
