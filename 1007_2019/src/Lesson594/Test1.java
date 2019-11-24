package Lesson594;



class Color1{
	String getName1() {
		return "赤";
	}
}

class Color2 extends Color1{
	String getName2() {
		return "青";
	}
}

public class Test1 {
	public static void main(String[] args) {

		Color2 c2 = new Color2();
		System.out.println(c2.getName1());
		System.out.println(c2.getName2());
	}
}