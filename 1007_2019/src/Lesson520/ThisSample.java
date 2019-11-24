package Lesson520;


class Person{
	//クラスを定義する。

	String name;
	//フィールドnameを定義する。

	Person(String name){
		this.name = name;
	}
	//コンストラクタによりnameの値を設定する。

	void printName() {
		System.out.println("[6]" + this.name);
	}
	//メソッドprintNameによりnameの値を表示する。


	void whatIsYourName() {
		this.printName();
	}
	//メソッドwhatsIsYourNameにより名前を表示する。
}

public class ThisSample {
	public static void main(String[] args) {
		Person object = new Person("太郎");
	//Personクラスのコンストラクタの引数（名前）に「太郎」を設定してobjectをつくる。

		System.out.println("[11] + object.name");
		//objectのフィールドNameを表示する。

		object.printName();
		//objectのprintNameメソッドを呼び出す。

		object.whatIsYourName();
		//objectのwhatIsYourNameメソッドを呼び出す。
	}
}