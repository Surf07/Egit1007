package Lesson583; //これもよう分からん



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

		Box b = new Box(123);
		Integer i = (Integer) b.get();
		System.out.println(i);
	}
}
