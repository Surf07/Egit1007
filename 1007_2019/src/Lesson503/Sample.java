package Lesson503;


class Suu{ int num;}


class Sub extends Suu{

	int num;
	public void get( int n) {

		num = n;
		num = n*10;
		super.num = n*100;
	}
}

public class Sample {
	public static void main(String[] args) {

		Sub sb = new Sub();
		sb.get(100);
		System.out.println(sb.num);

		Suu spr = sb;
		System.out.println(spr.num);

	}
}
