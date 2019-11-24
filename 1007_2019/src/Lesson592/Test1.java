package Lesson592;



class Color1{
	public void write1() {
		System.out.println("赤");
	}
}

public class Test1 {
	public static void main(String[] args) {

		Color1 c1 = new Color1() {
			@Override
			public void write1() {
				System.out.println("黄");
			}
		};
		c1.write1();
	}
}
