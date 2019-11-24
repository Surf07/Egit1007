package Lesson565;



interface SimpleInterface{
	public int doSomething(int n);
}

public class LambdaExample {

	static void printout(SimpleInterface i) {
		System.out.println(i.doSomething(100));
	}

	public static void main(String[] args) {
		printout(n -> n+1);
	}
}
