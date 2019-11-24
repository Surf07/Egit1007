package Lesson500;


class SimpleClass{

	String str;

	SimpleClass(String str){
		this.str = str;
	}
}

public class Main {
	public static void main(String[] args) {

		SimpleClass sc = new SimpleClass("Hello!");
		System.out.println(sc.str);
	}
}
