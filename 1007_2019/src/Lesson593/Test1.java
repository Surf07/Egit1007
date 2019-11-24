package Lesson593;



interface Color1{
	void write1();
}

public class Test1 {
	public static void main(String[] args) {

		Color1 c1 = new Color1() {
			@Override
			public void write1() {
				System.out.println("青");
			}
		};

		c1.write1();
	}

}
