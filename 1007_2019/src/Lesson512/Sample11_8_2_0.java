package Lesson512;



class TestClass{

	private int num;

	public TestClass(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void add(TestClass a) {
		num +=a.num;
	}

	public void subtract(TestClass a) {
		num -=a.num;
	}
}


public class Sample11_8_2_0 {
	public static void main(String[] args) {

		TestClass obj1 = new TestClass(400);
		TestClass obj2 = new TestClass(200);

		obj1.add(obj2);
		System.out.println(obj1.getNum());

		obj1.subtract(obj2);
		System.out.println(obj2.getNum());
	}
}
