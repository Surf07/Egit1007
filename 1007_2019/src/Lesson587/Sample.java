package Lesson587;//360まで



interface Foo{
	void methodA();
}

class FooImple implements Foo{

	@Override
	public void methodA() {
		System.out.println("methodB");
	}
}

public class Sample {
	public static void main(String[] args) {

		Foo f = new FooImple();
		f.methodA();

		new FooImple().methodA();
	}
}
