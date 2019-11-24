package Lesson515;


abstract class AbstractSample{
	public void sample() {

		System.out.println("A");
		test();

		System.out.print("C");
	}
	protected abstract void test();
}

class ConcreteSample extends AbstractSample{

	protected void test() {
		System.out.println("B");
	}
}

public class Sample {
	public static void main(String[] args) {

		ConcreteSample s = new ConcreteSample();
		s.sample();
	}
}
