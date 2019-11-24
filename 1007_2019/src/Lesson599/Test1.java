package Lesson599;


interface InterfaceA{
	static void printA() {
		System.out.println("a");
	};
}

public class Test1 {
	public static void main(String[] args) {
		InterfaceA.printA();
	}
}
