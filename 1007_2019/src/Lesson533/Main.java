package Lesson533;




class Sample{

	public Sample() {

		this("B");
		System.out.println("A");
	}

	public Sample(String str) {
		System.out.println(str);
	}
}


public class Main {
	public static void main(String[] args) {
		Sample s = new Sample();

	}
}
