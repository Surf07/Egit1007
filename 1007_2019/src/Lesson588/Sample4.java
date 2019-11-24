package Lesson588;//匿名クラスを使用しない場合



interface Foo{
	String methodA(String str);
}

class FooImple implements Foo{

	@Override
	public String methodA(String str) {
		return "Hello ! "+ str;
	}
}

public class Sample4 {
	public static void main(String[] args) {

		Foo f = new FooImple();    

		String str = f.methodA("methodA");

		System.out.println(str);
	}
}
