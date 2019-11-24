package Lesson589;//匿名クラスを利用した場合
                  //匿名クラスで生成したインスタンスを変数に代入する場合。


interface Foo{

	void methodA();
}

public class Sample2 {
	public static void main(String[] args) {

		Foo f = new Foo() { //変数fに匿名クラスで実装した結果を代入

			@Override
			public void methodA() {
				System.out.println("methodA");
			}

		};

		f.methodA();
	}

}
