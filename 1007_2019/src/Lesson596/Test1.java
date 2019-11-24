package Lesson596;



interface InterfaceA{
	void printA();
}

class ClassTest{
}

class Class1 extends ClassTest implements InterfaceA{

	@Override
	public void printA() {
		System.out.println("a");
	}
}

public class Test1 {
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		c1.printA();
	}
}
