package Lesson590;//匿名クラスで生成したインスタンスを変数に代入しない場合
                  //メソッドを実行したいだけであり、実装したクラスを再利用する予定がない場合、変数に代入する必要もない。


interface Foo{

	void methodA();
}


public class Sample3 {
	public static void main(String[] args) {

		new Foo() { //実数宣言無しで匿名クラスでの実装
			@Override
			public void methodA() {
				System.out.println("methodA");
			}
		}.methodA(); //実数クラスに対してメソッドの呼び出し
	}

}
