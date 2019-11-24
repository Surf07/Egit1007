package Lesson586;



class ClassSample<T>{

	private T t;

	public ClassSample(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
}

public class Main {
	public static void main(String[] args) {

		ClassSample<String> cs1 = new ClassSample<String>("Hello World");
		String str = cs1.getT();
		System.out.println(str);

		ClassSample<Integer> cs2 = new ClassSample<Integer>(555);
		Integer i = cs2.getT();
		System.out.println(i);
	}
}
