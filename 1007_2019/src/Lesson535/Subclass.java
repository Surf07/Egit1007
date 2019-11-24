package Lesson535;



class SuperClass{
	public SuperClass() {
		System.out.println("引数なしコンストラクタ");
	}
	public SuperClass(String s) {
		System.out.println("引数ありコンストラクタ:" + s);
	}
}

class Subclass extends SuperClass{
	public Subclass() {
		this(1,2);
		System.out.println();
	}

	public Subclass(int i, int j) {
		super();
	}

	public static void main(String[] args) {
		new SuperClass("hh");

	System.out.println();
}

}

