package Lesson598;



interface InterfaceA{

	default void printA() {
		System.out.println("a");
	};
}

interface InterfaceB extends InterfaceA{

	default void printB() {
		System.out.println("b");

	};
}

class Class1 implements InterfaceB{
}

public class Test1 {
	public static void main(String[] args) {

		Class1 c1 = new Class1();
		c1.printA();
		c1.printB();
	}
}
