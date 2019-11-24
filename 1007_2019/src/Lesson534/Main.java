package Lesson534;


class ThisSampleClass{
	private String str = "engineer";

	public void print(String str) {
		System.out.println("str =" + str);
		System.out.println("this.str =" + this.str);
		//thisを使ってメソッドの引数になっているローカル変数と（メンバー変数を）区別。
	}
}

public class Main {
	public static void main(String[] args) {
		String str = "samurai";
		ThisSampleClass sc = new ThisSampleClass();
		sc.print(str);
	}
}
