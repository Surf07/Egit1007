package Lesson591;



interface Foo{
	String methodA(String str);
}

public class Sample5 {
	public static void main(String[] args) {

		Foo f = new Foo() {

			@Override
			public String methodA(String str) {
				return "Hello !" + str;

			}
		};

		String str = f.methodA("methodA");
		System.out.println(str);
	}

}
