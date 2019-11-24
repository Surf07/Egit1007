package Lesson527;



class A{

	public A() {
		System.out.println("A: constractor");
	}
	public void sample() {
		System.out.println("A: sample");
	}
}

class B extends A {

	public B() {
		super();
	}

	public B(String str) {
		System.out.println("B: constructor");
	}

	public void sample() {
		super.sample();
	}

	public void sample(String str) {
		System.out.println("B:sample");
	}
}

public class Main {
	public static void main(String[] args) {

		B b = new B();
		b.sample();
		b.sample("test");
	}
}
