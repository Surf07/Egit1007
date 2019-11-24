package Lesson597;



interface InterfaceA{
	void printA();
}

interface InterfaceB{
	void printB(int cnt2);
}

class Class1 implements InterfaceA, InterfaceB{

	@Override
	public void printA() {
		System.out.println("a");
	}
	public void printB(int c) {
		System.out.println(c + 1);
	}
}

public class Test1 {
	public static void main(String[] args) {

		InterfaceA ia1 = new Class1();
		ia1.printA();

		InterfaceB ib1 = new Class1();
		ib1.printB(1);
	}
}
