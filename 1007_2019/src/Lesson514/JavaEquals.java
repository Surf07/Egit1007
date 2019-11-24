package Lesson514;


public class JavaEquals {
	public static void main(String[] args) {

		String hoge = "Hello";
		String fuga = "Hello";

		hoge += "!";
		fuga += "!";

		if(hoge == fuga) {
			System.out.println("hogeとfugaとは等しい");
		} else {
			System.out.println("hogeとhugaとは違う");
		}

		//このサンプルコードでは、String型変数のhogeとfugaを同じ文字列で初期化し、同じ文字列を追加。
		//String型は宣言、初期化時には擬似プリミティブ型として扱われますが、文字列を追加した時は参照型として扱われる。


		//構造体は値型、クラスは参照型。
		//値型は構造体、列挙体。参照型はクラス、配列、インターフェース、デリゲートです。

		//もう少し言うと、基本データ型変数に入る値は値そのものです。値と言うのは整数や少数や文字(char)やtrue(boolean)などの
		//ことです。それに対して参照変数の中に入っているのは、その変数が保持しているオブジェクト（あるいは配列）の参照値です。

		//int型などのプリミティブ型で２つの値が等しいか比較する場合は"=="演算子で比較しますが、String型などの参照型
		//の場合はequalsメソッドで比較する必要があります。

		if(hoge.equals(fuga)) {
			System.out.println("hogeとfugaとは等しい");
		} else {
			System.out.println("hogeとhugaとは違う");
		}
	}
}
