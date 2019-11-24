package Lesson542;



class Tanaka{

	public String name ="田中";
	public int age = 50;

	public void introduce() {
		System.out.println("Tanakaクラスのメソッド");
		System.out.println("この人は" + name + "です。");
	}

	public void howOldAmI() {
		System.out.println("Tanakaクラスのメソッド");
		System.out.println("家長は現在" + age + "才です。");
		System.out.println("");
	}
}

class TanakaIchiro extends Tanaka {
	public String name = "一郎";
	public int age = 20;

	@Override
	public void introduce() {
		System.out.println("TanakaIchiroクラスのメソッド");
		System.out.println("あの人は" + name + "です。");
		System.out.println(name + "は大きな声で挨拶をします");
	}
}

class TanakaJiro extends Tanaka {
	public String name = "二郎";
	public int age = 10;

	@Override
	public void introduce() {
		System.out.println("TanakaJiroクラスのメソッド");
		System.out.println("その人は" + super.name + " " +  name + "です。");
		System.out.println(name + "は小さな声ですが必ず頭を下げて挨拶をします");
		this.howOldAmI();
		super.howOldAmI();
	}
	@Override
	public void howOldAmI() {
		System.out.println("TanakaJiroクラスのメソッド");
		System.out.println(name + "は" + age + "才です。");
		System.out.println("");
	}
}

public class Main {
	public static void main(String[] args) {

		Tanaka tanaka = new Tanaka();
		System.out.println("①");
		tanaka.introduce();
		tanaka.howOldAmI();

		TanakaIchiro ichiro = new TanakaIchiro();
		System.out.println("②");
		ichiro.introduce();
		ichiro.howOldAmI();

		Tanaka tanaka2 = new TanakaJiro();
		System.out.println("③");
		tanaka2.introduce();
	}
}
