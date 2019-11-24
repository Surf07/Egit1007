package Lesson526;

//super(); あってもなくても実施となるのね。

class A{
	public A() {
		System.out.println("A");
	}
}

class B extends A{
	public B() {
		System.out.println("B");
	}
}

class C extends B{
	public C() {
		System.out.print("C");
	}
}

public class Main {
	public static void main(String[] args) {
		new C();
	}
}
