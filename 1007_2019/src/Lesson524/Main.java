package Lesson524;


class SuperClassSample{

	String str = "SuperClass";

	public String getStr() {
		return str;
	}
}


class SubClassSample extends SuperClassSample{

	String str = "SubClass";

	public String getStr() {
		return str;
	}

	public void print() {
		System.out.println("super.str =" + super.str);
		System.out.println("this.str =" + this.str);
		System.out.println("str =" +str);

		System.out.println("super.getStr() =" + super.getStr());
		System.out.println("this.getStr() =" + this.getStr());
		System.out.println("getSrt() =" + getStr());

	}
}

public class Main {
	public static void main(String[] args) {
		SubClassSample scs = new SubClassSample();
		scs.print();
	}

}
